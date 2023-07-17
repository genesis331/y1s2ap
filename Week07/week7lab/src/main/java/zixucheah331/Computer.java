package zixucheah331;

public class Computer {
    private String model;
    private int qty = 0;

    public Computer(String m) {
        model = m;
        qty++;
    }

    public int getQty() {
        return qty;
    }

    public void showDetail() {
        System.out.println("MODEL  :" + model);
    }
}