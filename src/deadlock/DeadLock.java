package deadlock;

public class DeadLock {


    public static void main(String[] args) {
        final String obj1 = "Ibrahim";
        final String obj2 = "Mohamed";

        Thread th1 = new Thread(){
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Th1 blocked obj1");
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }

                    synchronized (obj2) {
                        System.out.println("Th1 blocked obj2");
                    }
                }

            }
        };

        Thread th2 = new Thread(){
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Th2 blocked obj1");
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }

                    synchronized (obj2) {
                        System.out.println("Th2 blocked obj2");
                }

                }
            }
        };

        th1.start();
        th2.start();
    }
}
