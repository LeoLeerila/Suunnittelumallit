package A03;

public class Main {
    public static void main(String[] args) {
        OrganizationElement root = new Department("Organization");

        //create departments
        OrganizationElement department1 = new Department("department1");
        OrganizationElement department2 = new Department("department2");
        OrganizationElement department3 = new Department("department3");
        OrganizationElement department4 = new Department("department4");
        OrganizationElement department5 = new Department("department5");

        //create employees
        OrganizationElement employee1 = new Employee("employee1", 2200);
        OrganizationElement employee2 = new Employee("employee2", 2200);
        OrganizationElement employee3 = new Employee("employee3", 2200);
        OrganizationElement employee4 = new Employee("employee4", 2200);
        OrganizationElement employee5 = new Employee("employee5", 2200);
        OrganizationElement employee6 = new Employee("employee6", 2200);
        OrganizationElement employee7 = new Employee("employee7", 2200);
        OrganizationElement employee8 = new Employee("employee8", 2200);
        OrganizationElement employee9 = new Employee("employee9", 2200);
        OrganizationElement employee10 = new Employee("employee10", 2200);
        
        //initial structure
        root.add(department1);
        root.add(department2);
        root.add(employee1);
        root.add(employee2);
        
        department1.add(employee3);
        department1.add(department3);

        department2.add(department4);
        department2.add(department5);

        department3.add(employee4);
        department3.add(employee5);
        department3.add(employee6);
        
        department4.add(employee7);
        department4.add(employee8);

        root.organizationSalary();
        root.info();

        //add employees to structure
        department4.add(employee9);
        department4.add(employee10);

        root.organizationSalary();
        root.info();
        
        //remove employees from structure
        root.remove(department2);

        root.organizationSalary();
        root.info();
    }
}
