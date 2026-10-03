package A10;

public abstract class FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void handle(Message message){
        if(nextHandler != null){
            nextHandler.handle(message);
        } else {
            System.out.println("no handler for message");
        }
    }

    public void setNextHandler(FeedbackHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
