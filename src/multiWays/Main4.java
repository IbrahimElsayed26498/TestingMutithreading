package multiWays;

public class Main4 {
    public static void main(String[] args) {
        ThreadA thA = new ThreadA();
        ThreadB thB = new ThreadB();
        ThreadC thC = new ThreadC();

        thA.start();
        thB.start();
        thC.start();
    }
}

class ThreadA extends Thread{
    @Override
    public void run() {
        System.out.println("Thread A");
    }
}
class ThreadB extends Thread{
    @Override
    public void run() {
        System.out.println("Thread B");
    }
}
class ThreadC extends Thread{
    @Override
    public void run() {
        System.out.println("Thread C");
    }
}