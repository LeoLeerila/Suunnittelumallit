package A10;

public class CompensationHandler extends FeedbackHandler {
    
    @Override
    public void handle(Message message) {
        switch (message.type) {
            case COMPENSATION:
                if (message.getContent() == "valid") {
                    System.out.println("approved");
                } else if (message.getContent() == "review") {
                    System.out.println("reviewed");
                } else if (message.getContent() == "invalid") {
                    System.out.println("rejected");
                }

                System.out.println(message.type + " handled");
                break;
        
            default:
                super.handle(message);
                break;
        }
    }
}
