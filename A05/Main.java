package A05;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.write("initial log");
        logger.write("eof");

        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger   
    }
}
