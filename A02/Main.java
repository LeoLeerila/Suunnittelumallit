package A02;

public class Main {
    public static void main(String[] args) {
        String uistyle = "stylized";
        UIFactory uiFactory;

        if (uistyle == "stylized") {
            uiFactory = new StylizedFactory();
        } else {
            uiFactory = new HardFactory();
        }
        
        //create ui elements
        Button button = uiFactory.createButton("initial text");
        Checkbox checkbox = uiFactory.createCheckbox("initial text");
        Textfield textfield = uiFactory.createTextfield("initial text");

        //display elements with initial text
        button.display();
        System.out.println();
        checkbox.display();
        System.out.println();
        textfield.display();
        System.out.println();

        //change display text
        button.setText("this is a button");
        checkbox.setText("this is a checkbox");
        textfield.setText("this is a textfield");

        //display elements with updated text
        button.display();
        System.out.println();
        checkbox.display();
        System.out.println();
        textfield.display();
        System.out.println();
    }
}
