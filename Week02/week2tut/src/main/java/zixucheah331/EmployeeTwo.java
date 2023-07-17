package zixucheah331;

public class EmployeeTwo {
    private String name;
    private double salary;
    EmployeeTwo (String n, double s) {
        name = n;
        salary = s;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double s) {
        if (s < 25000)
            salary = s;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public void displayDetail() {
        System.out.println("Second staff is " + name); System.out.println("Salary is RM " + salary);
    }
}
