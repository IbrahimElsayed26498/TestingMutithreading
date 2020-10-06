package multiWays;

public class Main {
    public static void main(String[] args) {
        new TestThread().start();
        new TestThread().start();
        new TestThread().start();
    }
}

// Inherits Thread class

class TestThread extends Thread{
    public void run(){
        System.out.println("Task one.");
    }
}
