package zixucheah331;

public class MPV extends Car {
    public interface Engine {
        public void start();
        public void stop();
    }

    public interface Drivetrain {
        public void forward();
        public void reverse();
    }

    public static void main(String[] args) {
        System.out.println("Hello World from Cheah Zixu for Advanced Programming Test 1");
    }
}