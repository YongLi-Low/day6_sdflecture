package sg.edu.nus.iss;

public class MyRunnableImplementation implements Runnable{
    
    private String taskName;

    // Constructor with 1 parameter
    public MyRunnableImplementation(String taskName) {
        this.taskName = taskName;
    }

    // Constructor with no parameters
    public MyRunnableImplementation() {
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "\t Runnable..." + i);
        }
    }
}
