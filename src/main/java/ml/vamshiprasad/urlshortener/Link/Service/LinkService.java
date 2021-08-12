package ml.vamshiprasad.urlshortener.Link.Service;

import ml.vamshiprasad.urlshortener.Link.Repository.LinkRepository;
import ml.vamshiprasad.urlshortener.Link.Schema.Linke;
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

    public Linke getURL(Long id) {
        Optional<Linke> findLink = linkRepository.findLinkeBylinkID(id);
        if(findLink.isPresent()){
            return findLink.get();
        }
        else throw new IllegalStateException("URL doesn't exist with ID: "+id);
    }

    public Linke createNewLink(Linke linke){
        Linke link = linkRepository.save(linke);
        return link;
    }
}
