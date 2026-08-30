package A02;

public class HardFactory extends UIFactory {
    @Override
    public Button createButton(String text){
        return new ButtonHardBorder(text);
    }

    @Override
    public Checkbox createCheckbox(String text){
        return new CheckboxHardBorder(text);
    }
    
    @Override
    public Textfield createTextfield(String text){
        return new TextfieldHardBorder(text);
    }
}
