package A12;

import java.util.Date;

public class DocumentProxy implements IDocument {
    private String identifier;
    private Date creationDate;
    private Document document;
    private AccessControlService ACS;
    private User creator;

    public DocumentProxy(Document document) {
        this.document = document;
        this.identifier = document.getIdentifier();
        this.creationDate = document.getCreationDate();
        this.creator = document.getCreator();
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public String getContent(User user) throws AccessDeniedExeption {
        if (ACS == null) {
            ACS = AccessControlService.getInstance();
        }
        if (ACS.isAllowed(user, document)) {
            return document.getContent(user);
        }
        throw new AccessDeniedExeption("User " + user + " does not have access to this file");
    }

    public Date getCreationDate() {
        return creationDate;
    }
    
    public User getCreator() {
        return creator;
    }
}
