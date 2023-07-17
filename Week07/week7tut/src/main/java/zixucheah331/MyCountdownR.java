package zixucheah331;

public class MyCountdownR {
    public static void main(String args[]) {
        CountdownR cd1 = new CountdownR(1, 2);
        CountdownR cd2 = new CountdownR(2, 1);
        cd1.start();
        cd2.start();
    }
}
