
// In this case the compiler does not treat the Main
// as thread, so I must pass it to thread class.

public class Main2 implements Runnable{
    public void run(){
        for(int i=0; i<=10; i++){
            if(Thread.currentThread().getName().equals("Thread-0"))
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            else{
                try{
                    Thread.sleep(1500);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Main2 m1 = new Main2();
        Thread th1 = new Thread(m1);
        Main2 m2 = new Main2();
        Thread th2 = new Thread(m2);

        th1.start();
        th2.start();

    }
}
