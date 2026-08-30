package A03;

public class Employee extends OrganizationElement {
    private long salary;

    public Employee(String name, long salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public long getSalary(){
        return salary;
    }

    @Override
    public void info() {
        super.infoOpen();
        System.out.println(super.indent + super.indentIncrement + "<salary>" + salary + "</salary>");
        super.infoClose();
    }

    @Override
    public void organizationSalary(){
        throw new UnsupportedOperationException("Not supported in Employee.");
    }

    @Override
    public long getOrganizationSalary() {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }

    @Override
    public void add(OrganizationElement component) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }

    @Override
    public void remove(OrganizationElement component) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }

    @Override
    public OrganizationElement getChild(int index) {
        throw new UnsupportedOperationException("Not supported in Employee.");
    }
}
