package zixucheah331;

public class MyCompanyTwo {
    public void init() {
        EmployeeTwo staff1 = new EmployeeTwo("Joyah", 1000);
        EmployeeTwo staff2 = new EmployeeTwo("Mat", 2000);
        staff1.setSalary(3000);
        staff2.setName("Minah");
        staff2.setSalary(50000);
        System.out.println("First staff is " + staff1.getName());
        System.out.println("Salary is RM " + staff1.getSalary());
        staff2.displayDetail();
    }
    public static void main(String args[]) {
        MyCompanyTwo mct = new MyCompanyTwo();
        mct.init();
    }
}
