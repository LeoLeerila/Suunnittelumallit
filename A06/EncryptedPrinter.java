package A06;

public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String message) {
        String outMessage = "";
        for (int i = 0; i < message.length(); i++) {
            outMessage += (char) ~message.charAt(i);
        }        
        super.print(outMessage);
    }
}
