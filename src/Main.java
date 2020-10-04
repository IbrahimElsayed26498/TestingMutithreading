
public class Main implements Runnable{

    public static void main(String[] args) {
        new Main().fun();
    }
    public void fun(){
        try{
            // create a parent group
            ThreadGroup parentGroup =
                    new ThreadGroup("Parent Group");

            // create a child group
            ThreadGroup childGroup =
                    new ThreadGroup("Child Group");

            // create a thread
            Thread th1 = new Thread(parentGroup, this);
            System.out.printf("Starting %s .....\n",
                    th1.getName());
            th1.setPriority(Thread.MAX_PRIORITY); // set priority to max
            th1.start();

            // create another thread
            Thread th2 = new Thread(childGroup, this);
            System.out.printf("Starting %s .....\n",
                    th2.getName());
            th2.setPriority(Thread.MIN_PRIORITY); // set priority to minimum
            th2.start();

            System.out.println("No threading");

            // display the number of active threads
            System.out.printf("Active threads in \"%s\" is %d\n",
                    parentGroup.getName(), parentGroup.activeCount());
            System.out.printf("Active threads in \"%s\" is %d\n",
                    childGroup.getName(), childGroup.activeCount());
            // block until the other threads finished
            th2.join();
            th1.join();

        }catch (InterruptedException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            try{
                System.out.println(Thread.currentThread().getName() + " "+i);
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            i++;
        }
        System.out.printf("Thread \"%s\" finished executing\n",
                Thread.currentThread().getName());
    }
}
