package ml.vamshiprasad.urlshortener.Link.Repository;

import ml.vamshiprasad.urlshortener.Link.Schema.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
