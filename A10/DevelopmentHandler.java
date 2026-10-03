package A10;

public class DevelopmentHandler extends FeedbackHandler {
    
    @Override
    public void handle(Message message) {
        switch (message.type) {
            case DEVELOPMENT:
                if (message.getContent() == "priority") {
                    System.out.println("development message prioritized");
                } else {
                    System.out.println("development message logged");
                }
                break;
        
            default:
                super.handle(message);
                break;
        }
    }
}