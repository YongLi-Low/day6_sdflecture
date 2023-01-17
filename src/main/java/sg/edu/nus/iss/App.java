package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Thread thread1 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println(Thread.currentThread().getName() + "\tRunnable ..." + i);
        //         }
        //     }
        // });

        // thread1.start();

        MyRunnableImplementation mRI1 = new MyRunnableImplementation("Task 1");
        MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task 2");
        MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task 3");
        MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task 4");
        MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task 5");
        // Thread thread2 = new Thread(mRI);
        // thread2.start();

        // Thread thread3 = new Thread(mRI);
        // thread3.start();

        // Single Thread, can only execute one task before executing another

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);

        // pool-1-thread-1 Task 1   Runnable...0
        // pool-1-thread-1 Task 1   Runnable...1
        // pool-1-thread-1 Task 1   Runnable...2
        // pool-1-thread-1 Task 1   Runnable...3
        // pool-1-thread-1 Task 1   Runnable...4
        // pool-1-thread-1 Task 2   Runnable...0
        // pool-1-thread-1 Task 2   Runnable...1
        // pool-1-thread-1 Task 2   Runnable...2
        // pool-1-thread-1 Task 2   Runnable...3
        // pool-1-thread-1 Task 2   Runnable...4

        // executorService.shutdown();

        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // Never specify any thread number but cachedthreadpool will determine how many threads it will use
        // The limit is how many threads your CPU has.
        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        MyRunnableInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };  // need to add semicolon at the end

        MyRunnableInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        MyRunnableInterface<Integer> minusOperation = (a, b) -> {
            return a - b;
        };

        MyRunnableInterface<String> concateString = (a, b) -> {
            return a + b;
        };

        MyMessageInterface printString = (a) -> {
            System.out.println(a);
        };

        System.out.println("Add operation: " + addOperation.process(1, 6));
        System.out.println("Multiply operation: " + multiplyOperation.process(15, 8));
        System.out.println("Add operation: " + minusOperation.process(4, 16));
        System.out.println("Concate String: " + concateString.process("Hello ", "world"));
        printString.printMessage("Let's take a break now.");
    }
}
