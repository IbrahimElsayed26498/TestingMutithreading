package staicSync;

public class Test {
    public static void main(String[] args) {
        MyThread myTh = new MyThread();
        MyThread1 myTh1 = new MyThread1();
        MyThread2 myTh2 = new MyThread2();

        myTh.start();
        myTh1.start();
        myTh2.start();

    }
}
class Table{
     synchronized void view(int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(i * n);
        }
        try{
            Thread.sleep(400);
        }catch (InterruptedException e){

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        new Table().view(1);
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        new Table().view(1);
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        new Table().view(1);
    }
}
