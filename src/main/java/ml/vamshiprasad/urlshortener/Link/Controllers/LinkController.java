package ml.vamshiprasad.urlshortener.Link.Controllers;

import ml.vamshiprasad.urlshortener.Link.Schema.Link;
import ml.vamshiprasad.urlshortener.Link.Service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Optional<Link> getURL(@PathVariable("id") Long id){
        return linkService.getURL(id);
    }

    @PostMapping("/postURL")
    public void addNewLink(@RequestBody Link link){
        linkService.createNewLink(link);
    }
}
