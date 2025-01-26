public class Main {
    public static void main(String[] args) {
        // Create Employee and Manager objects
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Alice Smith", 75000, "HR");

        // Display details for Employee and Manager
        System.out.println("Employee Details:");
        emp.displayDetails();
        
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}
