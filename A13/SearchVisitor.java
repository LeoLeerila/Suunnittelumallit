package A13;

public class SearchVisitor implements FileSystemVisitor{
    private String pattern;

    @Override
    public void visit(File file) {
        if (file.toString().contains(pattern)) {
            System.out.println(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getChildren()) {
            element.accept(this);
        }
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
}
