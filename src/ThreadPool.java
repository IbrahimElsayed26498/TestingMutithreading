public class ThreadPool implements Runnable{
    String name;

    public ThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start name: " + name);
        sleep();
        /*
        If there is no other threads could be added to
        the pool, so it will continue run the full threads,
        which mean, it will run the next line.
        */
        System.out.println(Thread.currentThread().getName() + " Full" );
    }

    private void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("e: " + e.getMessage());
        }
    }
}
