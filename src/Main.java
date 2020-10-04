

// In this case the compiler treats Main as a thread class.
public class Main extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(300);
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
            m.join(1000); //m thread will run alone for 1000 ms,
                                // then it will be with the other two threads.
            System.out.println("(m) Thread object Finished.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        m2.start();
        m3.start();
    }
}
