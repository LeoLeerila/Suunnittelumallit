package A14;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    
    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }

    public void getComputer() {
        System.out.println(computerBuilder.getComputer());
    }
}
