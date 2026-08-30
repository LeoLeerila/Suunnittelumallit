package A02;

public class StylizedFactory extends UIFactory{
    @Override
    public Button createButton(String text){
        return new ButtonStylizedBorder(text);
    }

    @Override
    public Checkbox createCheckbox(String text){
        return new CheckboxStylizedBorder(text);
    }
    
    @Override
    public Textfield createTextfield(String text){
        return new TextfieldStylizedBorder(text);
    }
    
}
