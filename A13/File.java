package A13;

public class File implements FileSystemElement{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override 
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override 
    public String toString() {
        return name;
    }
}
