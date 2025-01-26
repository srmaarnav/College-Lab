public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Calling the base class constructor
        this.department = department;
    }

    // Overriding displayDetails() method
    @Override
    public void displayDetails() {
        // Calling the base class method to display common details
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
