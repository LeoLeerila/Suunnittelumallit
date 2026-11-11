package A14;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("AMD Ryzen 7 7800X3D");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("KINGSTON NVME M.2 2TB");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX5080 16GB");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Linux");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
