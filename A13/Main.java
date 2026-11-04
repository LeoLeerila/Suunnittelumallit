package A13;

public class Main {
    private static Directory root = new Directory("/");
    
    public static void main(String[] args) {
        populateFileSystem();

        SearchVisitor sv = new SearchVisitor();
        SizeCalculatorVisitor scv = new SizeCalculatorVisitor();

        sv.setPattern(".txt");
        root.accept(sv);

        root.accept(scv);
    }

    private static void populateFileSystem() {
        Directory desktopU1 = new Directory("Desktop/");
        Directory desktopU2 = new Directory("Desktop/");
        Directory user1 = new Directory("User1/");
        Directory user2 = new Directory("User2/");
        Directory home = new Directory("home/");

        desktopU1.addChild(new File("DesktopFile1.txt", 1));
        desktopU1.addChild(new File("DesktopFile2.png", 5));
        
        user1.addChild(desktopU1);
        user1.addChild(new File("UserFile.csv", 10));
        user1.addChild(new File("UserFile.mp4", 300));

        desktopU2.addChild(new File("DesktopText.txt", 2));
        desktopU2.addChild(new File("DesktopPicture.png", 15));
        
        user2.addChild(desktopU2);
        user2.addChild(new File("UserFile.yaml", 2));
        user2.addChild(new File("UserFile.mp3", 100));

        home.addChild(user1);
        home.addChild(user2);

        root.addChild(home);
    }
}
