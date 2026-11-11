package A14;

public class Computer {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public Computer() {

    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Processor: "); sb.append(processor); sb.append("\n");
        sb.append("Ram: "); sb.append(ram); sb.append(" GB"); sb.append("\n");
        sb.append("Hard drive: "); sb.append(hardDrive); sb.append("\n");
        sb.append("Graphics card: "); sb.append(graphicsCard); sb.append("\n");
        sb.append("Operating system: "); sb.append(operatingSystem); sb.append("\n");
        return sb.toString();
    }
}
