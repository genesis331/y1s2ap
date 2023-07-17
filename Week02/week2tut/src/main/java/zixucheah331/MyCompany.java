package zixucheah331;

public class MyCompany {
    public static void main(String args[]) {
        Employee staff1 = new Employee("Joyah", 2000);
        Employee staff2 = new Employee("Mat", 500);
        staff2.deductEPF();
        System.out.println("First staff is " + staff1.name);
        System.out.println("Salary is RM " + staff1.salary);
        System.out.println("Second staff is " + staff2.name);
        System.out.println("Salary is RM " + staff2.getSalary());
    }
}
