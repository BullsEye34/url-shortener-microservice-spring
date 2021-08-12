package ml.vamshiprasad.urlshortener.Link.Controllers;

import ml.vamshiprasad.urlshortener.Link.Service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/urlShortener")
public class LinkController {
    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/getURL/{id}")
    public String getURL(@PathVariable("id") Long id){
        return linkService.getURL(id);
    }
}
