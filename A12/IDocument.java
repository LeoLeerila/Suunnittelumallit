package A12;

import java.util.Date;

public interface IDocument {
    //public String getContent(User user, IDocument document);
    //public Date getCreationDate(IDocument document);

    public String getIdentifier();
    public String getContent(User user) throws AccessDeniedExeption;
    public Date getCreationDate();
    public User getCreator();
}
