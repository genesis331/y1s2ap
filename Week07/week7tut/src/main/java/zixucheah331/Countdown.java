package zixucheah331;

public class Countdown extends Thread {
    int idx, sec;

    public Countdown(int i, int s) {
        idx = i;
        sec = s;
    }

    public void run() {
        for (int k = 5; k >= 0; k--) {
            System.out.println("Index " + idx + " Countdown " + k);
            try {
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {}
        }
    }
}
