package A03;

public abstract class OrganizationElement {
    protected String name;
    protected String indent = "";
    protected String indentIncrement = "    ";

    public OrganizationElement(String name){
        this.name = name;
    }

    public abstract void info();

    public void infoOpen(){
        System.out.println(indent + "<" + this.name + ">");
    }

    public void infoClose(){
        System.out.println(indent + "</" + this.name + ">");
    }

    public void setIndent(String indent){
        this.indent = indent;
    }

    public abstract void organizationSalary();

    public abstract long getOrganizationSalary();

    public abstract long getSalary();

    public abstract void add(OrganizationElement element);

    public abstract void remove(OrganizationElement element);

    public abstract OrganizationElement getChild(int index);
}
