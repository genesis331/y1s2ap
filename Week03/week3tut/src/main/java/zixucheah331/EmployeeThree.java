package zixucheah331;

public class EmployeeThree {
    private String name;
    private double salary;
    private boolean status;
    private int yearBorn;

    EmployeeThree (String n, double s, int y) {
        name = n;
        salary = s;
        yearBorn = y;
        status = true;
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
    public String getStatus() {
        return status? "active":"resigned";
    }
    public void resigned() {
        status = false;
    }
    public void displayDetail() {
        System.out.println("==========================");
        System.out.println("NAME   : " + name);
        System.out.println("SALARY : " + salary);
        System.out.println("STATUS : " + getStatus());
        System.out.println("AGE    : " + (2014 - yearBorn));
    }
}
