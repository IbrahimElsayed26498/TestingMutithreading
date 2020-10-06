package gc;

public class TestingGC {
    public static void main(String[] args) {
        TestGC t1 = new TestGC();
        TestGC t2 = new TestGC();
        
        t1 = null;
        t2 = null;

        System.gc();
    }
}
class TestGC {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("You are using GC");
    }
}
