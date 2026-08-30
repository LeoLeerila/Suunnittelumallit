package A03;

import java.util.ArrayList;

public class Department extends OrganizationElement {
    private ArrayList<OrganizationElement> children = new ArrayList<>();

    public Department(String name){
        super(name);
    }

    @Override
    public void organizationSalary(){
        System.out.println("Total organization salary: " + getOrganizationSalary());
    }

    @Override
    public long getOrganizationSalary(){
        long totalSalary = 0;
        for (OrganizationElement child : children) {
            if (child.getClass() == Employee.class){
                totalSalary += child.getSalary();
            } else {
                totalSalary += child.getOrganizationSalary();
            }
        }
        return totalSalary;
    }

    @Override
    public void info() {
        super.infoOpen();
        for (OrganizationElement child : children) {
            child.info();
        }
        super.infoClose();
    }

    @Override
    public long getSalary() {
        throw new UnsupportedOperationException("Not supported in Department.");
    }

    @Override
    public void add(OrganizationElement element) {
        element.setIndent(super.indent + super.indentIncrement);
        this.children.add(element);
    }

    @Override
    public void remove(OrganizationElement element) {
        this.children.remove(element);
    }

    @Override
    public OrganizationElement getChild(int index) {
        return this.children.get(index);
    }
}
