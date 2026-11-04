package A12;

import java.util.Date;

public class Main {
    private static Library library = new Library();

    public static void main(String[] args) {
        User matti = createUser("Matti");
        User root = createUser("root");

        library.addDocument("Matti1", "Matin dokumentti", new Date(), matti, false);
        library.addDocument("Matti2", "Matin salainen dokumentti", new Date(), matti, true);
        library.addDocument("root1", "Superuser document", new Date(), root, false);
        library.addDocument("root2", "Superuser secret document", new Date(), root, true);
        
        IDocument document = library.getDocuments().get("Matti1");
        System.out.println("\nread Matti1 with user Matti");
        readDocument(document, matti);

        document = library.getDocuments().get("Matti2");
        System.out.println("\nread Matti2 with user Matti");
        readDocument(document, matti);
        System.out.println("\nread Matti2 with user root");
        readDocument(document, root);

        document = library.getDocuments().get("root1");
        System.out.println("\nread root1 with user Matti");
        readDocument(document, matti);
        
        document = library.getDocuments().get("root2");
        System.out.println("\nread root2 with user Matti");
        readDocument(document, matti);
        
    }

    private static User createUser(String userName) {
        return new User(userName);
    }

    private static void readDocument(IDocument idocument, User user) {
        readDocumentIdentifier(idocument);
        readDocumentCreator(idocument);
        readDocumentCreationDate(idocument);
        readDocumentContent(idocument, user);
    }

    private static void readDocumentContent(IDocument idocument, User user) {
        try {
            System.out.println(idocument.getContent(user));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readDocumentIdentifier(IDocument idocument) {
        System.out.println(idocument.getIdentifier());
    }

    private static void readDocumentCreationDate(IDocument idocument) {
        System.out.println(idocument.getCreationDate());
    }

    private static void readDocumentCreator(IDocument idocument) {
        System.out.println(idocument.getCreator());
    }
}
