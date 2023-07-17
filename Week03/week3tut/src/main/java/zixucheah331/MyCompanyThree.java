package zixucheah331;

public class MyCompanyThree {
    public void init() {
        Officer staff1 = new Officer("Joyah", 3000, 1965, 300);
        Officer staff2 = new Officer("Mat", 2000,1974, 100);
        Manager staff3 = new Manager("Minah", 8000, 1983, "Honda Accord");
        Clerk staff4 = new Clerk("Selamat", 800, 1978, 50);
        staff1.displayDetail();
        staff2.displayDetail();
        staff3.displayDetail();
        staff2.resigned();
        staff2.displayDetail();
        staff4.displayDetail();
    }
    public static void main(String args[]) {
        MyCompanyThree mct = new MyCompanyThree();
        mct.init();
    }
}