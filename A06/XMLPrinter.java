package A06;

public class XMLPrinter extends PrinterDecorator{
    public XMLPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String message) {
        message = "<message>" + message + "</message>";
        super.print(message);
    }
}
