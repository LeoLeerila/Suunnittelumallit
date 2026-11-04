package A12;

import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<String, IDocument> documents = new HashMap<String, IDocument>();

    public Library() {
        
    }

    public void addDocument(String identifier, String content, Date creationDate, User creator, boolean protectedDocument) {
        if (!documents.containsKey(identifier)) {
            IDocument idocument = createDocument(identifier, content, creationDate, creator, protectedDocument);
            documents.put(idocument.getIdentifier(), idocument);
        } else {
            System.out.println("document already exists");
        }
    }

    public HashMap<String, IDocument> getDocuments() {
        return documents;
    }

    public IDocument createDocument(String identifier, String content, Date creationDate, User creator, boolean protectedDocument) {
        if (protectedDocument) {
            return new DocumentProxy(new Document(identifier, content, creationDate, creator));
        } else {
            return new Document(identifier, content, creationDate, creator);
        }
    }
}
