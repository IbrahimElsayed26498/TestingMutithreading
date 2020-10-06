package interrupt;

public class InterruptTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Task");
            } catch (InterruptedException e) {
                System.out.println("Thread handled....."+ e);
            }
        }
    }

    public static void main(String[] args) {
        InterruptTest interruptTest = new InterruptTest();
        interruptTest.start();
        interruptTest.interrupt();
    }
}
