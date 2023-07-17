package zixucheah331;

public class MyCountdown {
    public static void main(String args[]) {
        Countdown cd1 = new Countdown(1, 2);
        Countdown cd2 = new Countdown(2, 1);
        cd1.start();
        cd2.run();
    }
}
