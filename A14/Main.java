package A14;

public class Main {
    public static void main(String[] args) {
        ComputerDirector gamingDirector = new ComputerDirector(new GamingComputerBuilder());
        ComputerDirector officeDirector = new ComputerDirector(new OfficeComputerBuilder());

        gamingDirector.constructComputer();
        officeDirector.constructComputer();

        gamingDirector.getComputer();
        officeDirector.getComputer();
    }
}
