package multiWays;

// using Runnable Interface
public class Mian2 {
    public static void main(String[] args) {
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
    }

    static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Task one.");
        }
    }
}


