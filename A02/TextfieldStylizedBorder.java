package A02;

public class TextfieldStylizedBorder extends Textfield {
    String text;

    public TextfieldStylizedBorder(String text){
        this.text = text;
    }
    
    @Override
    public void display() {
        String border = "+";
        for(int i = 0; i < text.length(); i++){border += "-";}
        border += "+";

        System.out.println(border);
        System.out.println("|" + text + "|");
        System.out.println(border);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
