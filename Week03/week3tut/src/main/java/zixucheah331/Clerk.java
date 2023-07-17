package zixucheah331;

public class Clerk extends EmployeeThree {
    private double cola;
    public Clerk(String n, double s, int y, double c) {
        super(n,s,y);
        cola = c;
    }
    public double getCola() {
        return cola;
    }
    public void displayDetail() {
        super.displayDetail();
        System.out.println("COLA   : RM" + cola);
    }
}
