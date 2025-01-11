public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "";
        this.salary = 0.0;
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: "+super.toString();
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
