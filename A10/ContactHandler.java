package A10;

public class ContactHandler extends FeedbackHandler {
    
    @Override
    public void handle(Message message) {
        switch (message.type) {
            case CONTACT:
                System.out.println("message from " + message.getEmail() + " forwarded");
                break;
        
            default:
                super.handle(message);
                break;
        }
    }
}