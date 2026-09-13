package A06;

public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello World!"); //prints Hello World!

        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!"); //prints <message>ﾷﾚﾓﾓﾐ￟ﾨﾐﾍﾓﾛ￞</message>

        Printer printer3 = new EncryptedPrinter(new BasicPrinter());
        printer3.print("ﾷﾚﾓﾓﾐ￟ﾨﾐﾍﾓﾛ￞"); //prints Hello World!

    }
}
