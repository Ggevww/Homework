package homework10.system_design.task3;

/**
 * Employee class representing an employee with a name and salary.
 * It includes constructors, getters, setters, and a toString method.
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Gets the name of the employee.
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the employee.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the salary of the employee.
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Sets the salary of the employee.
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Constructor to create an Employee with a name and salary.
     * @param name the name of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    /**
     * Constructor to create an Employee with a name and a default salary of 1500.
     * @param name the name of the employee
     */
    public Employee(String name){
        this(name, 1500);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 2000);
        Employee employee2 = new Employee("Bob");

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.setSalary(2500);
        System.out.println("Updated " + employee1.getName() + "'s salary: " + employee1.getSalary());
    }
}
