package ml.vamshiprasad.urlshortener.Link.Repository;

import ml.vamshiprasad.urlshortener.Link.Schema.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    Optional<Link> findLinkByID(Long id);
}
