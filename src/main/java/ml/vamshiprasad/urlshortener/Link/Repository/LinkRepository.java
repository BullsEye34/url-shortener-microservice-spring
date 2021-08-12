package ml.vamshiprasad.urlshortener.Link.Repository;

import ml.vamshiprasad.urlshortener.Link.Schema.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Optional<Link> findLinkByID(Long id);
}
