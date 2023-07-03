package homeworks.lecture8;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public double raiseSalary(double percentage) {
        double raiseAmount = salaryPerMonth * percentage / 100;
        salaryPerMonth += raiseAmount;
        return salaryPerMonth;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salaryPerMonth=" + salaryPerMonth + "]";
    }
}

