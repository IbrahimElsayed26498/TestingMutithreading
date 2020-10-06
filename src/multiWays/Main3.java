package multiWays;

// using multi running Threads.

public class Main3 {
    public static void main(String[] args) {
        Thread th1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Task one.");
            }
        };
        Thread th2 = new Thread(){
            @Override
            public void run() {
                System.out.println("Task two.");
            }
        };
        Thread th3 = new Thread(){
            @Override
            public void run() {
                System.out.println("Task three.");
            }
        };

        th1.start();
        th2.start();
        th3.start();
    }
}
