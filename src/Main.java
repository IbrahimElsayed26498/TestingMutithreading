

// In this case the compiler treats Main as a thread class.
public class Main extends Thread{
    public void run(){
        System.out.println("In the name of Allah.");
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }
}
