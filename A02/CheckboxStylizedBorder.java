package A02;

public class CheckboxStylizedBorder extends Checkbox {
    String text;

    public CheckboxStylizedBorder(String text){
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
