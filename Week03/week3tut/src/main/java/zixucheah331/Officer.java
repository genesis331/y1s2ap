package zixucheah331;

public class Officer extends EmployeeThree {
    private double petrol;
    public Officer(String n, double s, int y, double p) {
        super(n,s,y);
        petrol = p;
    }
    public double getPetrol() {
        return petrol;
    }
    public void displayDetail() {
        super.displayDetail();
        System.out.println("PETROL : " + petrol);
    }
}
