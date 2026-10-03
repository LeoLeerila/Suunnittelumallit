package A10;



public class Main {
    

    public static void main(String[] args) {
        FeedbackHandler primaryHandler;

        FeedbackHandler compensationHandler = new CompensationHandler();
        FeedbackHandler contactHandler = new ContactHandler();
        FeedbackHandler developmentHandler = new DevelopmentHandler();
        FeedbackHandler generalHandler = new GeneralHandler();
        
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);
        primaryHandler = compensationHandler;

        Message compensationMessage = new Message(Type.COMPENSATION, "valid", "gamer@gaming");
        primaryHandler.handle(compensationMessage);

        compensationMessage = new Message(Type.COMPENSATION, "review", "gamer@gaming");
        primaryHandler.handle(compensationMessage);

        compensationMessage = new Message(Type.COMPENSATION, "invalid", "gamer@gaming");
        primaryHandler.handle(compensationMessage);

        Message contactMessage = new Message(Type.CONTACT, "some content", "gamer@gaming");
        primaryHandler.handle(contactMessage);

        Message developmentMessage = new Message(Type.DEVELOPMENT, "priority", "gamer@gaming");
        primaryHandler.handle(developmentMessage);

        developmentMessage = new Message(Type.DEVELOPMENT, "some content", "gamer@gaming");
        primaryHandler.handle(developmentMessage);

        Message generalMessage = new Message(Type.GENERAL, "some general content", "gamer@gaming");
        primaryHandler.handle(generalMessage);

        
    }
}
