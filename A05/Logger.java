package A05;

import java.io.FileWriter;

public class Logger {
    private static Logger instance;

    private FileWriter fw;
    private String filename;
    
    private Logger(){
        this.filename = "log.txt";
    }

    public static synchronized Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public synchronized void setFileName(String filename){
        close();
        this.filename = filename;
    }

    public synchronized void write(String text){
        if (fw == null) {
            try {
                fw = new FileWriter(filename, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            fw.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void close(){
        try {
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        fw = null;
    }
}