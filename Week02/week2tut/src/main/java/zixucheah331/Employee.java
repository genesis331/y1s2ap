package zixucheah331;

public class Employee {
    String name;
    double salary = 1000;

    public Employee (String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void deductEPF() {
        salary = salary * 0.9;
    }
}
