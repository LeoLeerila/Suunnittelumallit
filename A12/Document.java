package A12;

import java.util.Date;

public class Document implements IDocument {
    private String identifier;
    private String content;
    private Date creationDate;
    private User creator;

    public Document(String identifier, String content, Date creationDate, User creator) {
        this.identifier = identifier;
        this.content = content;
        this.creationDate = creationDate;
        this.creator = creator;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getContent(User user) {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public User getCreator() {
        return creator;
    }
}
