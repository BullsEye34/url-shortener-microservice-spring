package ml.vamshiprasad.urlshortener.Link.Service;

import ml.vamshiprasad.urlshortener.Link.Repository.LinkRepository;
import ml.vamshiprasad.urlshortener.Link.Schema.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LinkService {
    private final LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Optional<Link> getURL(Long id) {
        Optional<Link> findLink = linkRepository.findLinkByID(id);
        if(!findLink.isPresent()){
            throw new IllegalStateException("URL doesn't exist with ID: "+id);
        }
        else return linkRepository.findById(id);
    }

    public void createNewLink(Link link){
        linkRepository.save(link);
    }
}
