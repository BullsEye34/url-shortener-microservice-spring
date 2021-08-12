package ml.vamshiprasad.urlshortener.Link.Schema;

import javax.persistence.*;

@Entity
@Table
public class Linke {
    public Linke() {
    }
    @Id
    @SequenceGenerator(
            name="link_sequence",
            sequenceName = "link_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "link_sequence"
    )
    private Long linkID;
    private String url;

    public Linke(String url) {
        this.url = url;
    }

    public Linke(Long linkID, String url) {
        this.linkID = linkID;
        this.url = url;
    }

    public Long getLinkID() {
        return linkID;
    }

    public void setLinkID(Long linkID) {
        this.linkID = linkID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
