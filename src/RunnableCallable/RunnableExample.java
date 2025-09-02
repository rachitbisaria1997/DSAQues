package RunnableCallable;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("running in thread " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task);
        thread.start();


        // runnable returns no result
    }

}
