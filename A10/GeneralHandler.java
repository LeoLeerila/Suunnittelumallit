package A10;

public class GeneralHandler extends FeedbackHandler {
    
    @Override
    public void handle(Message message) {
        switch (message.type) {
            case GENERAL:
                System.out.println("general feedback analyzed");
                break;
        
            default:
                super.handle(message);
                break;
        }
    }
}