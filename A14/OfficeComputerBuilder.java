package A14;

public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("INTEL N150");
    }

    @Override
    public void buildRam() {
        computer.setRam(16);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("KINGSTON NVME M.2 2TB");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Intel Graphics (integrated)");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }    
}
