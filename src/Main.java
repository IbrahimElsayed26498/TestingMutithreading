import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// In this case the compiler treats Main as a thread class.
public class Main{

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable threadPool = new ThreadPool("th"+i);
            executorService.execute(threadPool);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println("Your task is finished");
    }
}
