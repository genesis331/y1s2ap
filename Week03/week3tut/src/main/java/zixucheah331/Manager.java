package zixucheah331;

public class Manager extends EmployeeThree {
    private String car;
    public Manager(String n, double s, int y, String c) {
        super(n,s,y);
        car = c; }
    public String getCar() {
        return car;
    }
    public void displayDetail() {
        super.displayDetail();
        System.out.println("CAR     : " + car);
    }
}
