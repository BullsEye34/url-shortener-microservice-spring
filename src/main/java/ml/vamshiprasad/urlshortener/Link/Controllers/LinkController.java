package ml.vamshiprasad.urlshortener.Link.Controllers;

import ml.vamshiprasad.urlshortener.Link.Schema.Linke;
import ml.vamshiprasad.urlshortener.Link.Service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/urlShortener")
public class LinkController {
    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/getURL/{id}")
    public ModelAndView method(@PathVariable("id") Long id) {
        Linke linke = linkService.getURL(id);
        return new ModelAndView("redirect:" + linke.getUrl());
    }

    @PostMapping("/postURL")
    public Linke addNewLink(@RequestBody Linke linke){
        return linkService.createNewLink(linke);
    }


}
