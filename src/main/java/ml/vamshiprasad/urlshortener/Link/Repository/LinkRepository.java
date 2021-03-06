package ml.vamshiprasad.urlshortener.Link.Repository;

import ml.vamshiprasad.urlshortener.Link.Schema.Linke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends JpaRepository<Linke, Long> {
    Optional<Linke> findLinkeBylinkID(Long id);
}
