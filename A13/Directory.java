package A13;

import java.util.ArrayList;

public class Directory implements FileSystemElement{
    private String name;
    private ArrayList<FileSystemElement> children = new ArrayList<FileSystemElement>();

    public Directory(String name) {
        this.name = name;
    }

    public void addChild(FileSystemElement element) {
        children.add(element);
    }

    public ArrayList<FileSystemElement> getChildren() {
        return children;
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
