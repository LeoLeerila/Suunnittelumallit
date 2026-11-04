package A12;

public class AccessControlService {
    private static AccessControlService instance;

    public static AccessControlService getInstance(){
        if (instance == null){
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(User user, IDocument document) {
        boolean allowed = false;

        if (document.getCreator().getUsername() == user.getUsername()) {
            allowed = true;
        }

        return allowed;
    }

}
