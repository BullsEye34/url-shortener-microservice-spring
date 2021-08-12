package ml.vamshiprasad.urlshortener.Link.Schema;

public class Link {
    private Long id;
    private String url;

    public Link(String url) {
        this.url = url;
    }

    public Link(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
