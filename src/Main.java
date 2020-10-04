

// In this case the compiler treats Main as a thread class.
public class Main extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(100);
                System.out.println( Thread.currentThread().getName() +"  "+ i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Main m2 = new Main();
        Main m3 = new Main();

        m.start();
        try {
            m.join();
            System.out.println("(m) Thread object Finished.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        m2.start();
        m3.start();
    }
}
