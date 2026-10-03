package A10;

enum Type {
        COMPENSATION,
        CONTACT,
        DEVELOPMENT,
        GENERAL;
};

public class Message {
    Type type;
    private String content;
    private String email;

    public Message(Type type, String content, String email){
        this.type = type;
        this.content = content;
        this.email = email;
    }

    public Type getType(){
        return type;
    }

    public String getContent(){
        return content;
    }
    
    public String getEmail(){
        return email;
    }
    
}
