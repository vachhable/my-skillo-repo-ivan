package homeworks.lecture8;

public class Main {
    public static void main(String[] args) {
        Circle s1 = new Circle(3.0);
        System.out.println(s1.getArea());
        System.out.println(s1);
        Shape s2 = new Circle(3.0); // Upcast Circle to Shape
        System.out.println(s2.getArea());
        System.out.println(s2);
        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3);
        System.out.println(s3.getPerimeter());
        // Square s4 = new Shape();
        Square s5 = new Square(6.0);
        System.out.println(s5.getArea());
        System.out.println(s5.getPerimeter());


        Employee employee = new Employee(1, "Ivan", "Penchev", 5000.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Updated Salary: " + employee.raiseSalary(10));
        System.out.println(employee);
    }
}
