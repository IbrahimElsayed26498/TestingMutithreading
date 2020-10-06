package interrupt;

public class InterruptTest2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            if (interrupted()){
                System.out.println("Interrupted " +
                        Thread.currentThread().getName());

            }
            else {
                System.out.println("Normal "
                        + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        InterruptTest2 interruptTest = new InterruptTest2();
        InterruptTest2 interruptTest2 = new InterruptTest2();

        interruptTest.start();
        interruptTest.interrupt();

        interruptTest2.start();
    }
}
