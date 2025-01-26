import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for version control

    private String name;
    private int id;
    private transient double salary; // This field won't be serialized

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

