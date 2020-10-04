

// In this case the compiler treats Main as a thread class.
public class Main extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Main m = new Main();
        Main m2 = new Main();

        System.out.println("m = " + m.getName() + "(10)");
        System.out.println("m2 = " + m2.getName() + "(5)");
        System.out.println();

        m.setPriority(10);
        m2.setPriority(5);

        m.start();
        m2.start();
    }
}
