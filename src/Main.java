

// In this case the compiler treats Main as a thread class.
public class Main extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread: "
                    + currentThread().getName());
        }else{
            System.out.println("User thread: " +
                    currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Main m2 = new Main();

        m.setDaemon(true);
        m.start();

        m2.start();
    }
}
