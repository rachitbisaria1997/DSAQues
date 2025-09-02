package RunnableCallable;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> task = () -> {

            System.out.println("computing in thread "+ Thread.currentThread().getName());
            return 10 + 20;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(task);

        System.out.println(future.isDone());

        System.out.println("result = "+ future.get());
        System.out.println(future.isDone());
        executorService.shutdown();

        //When you submit a Callable (or Runnable) task to an ExecutorService, it immediately returns a Future object.
        //
        //The actual task runs in a separate thread, and the Future allows you to:
        //
        //Check if the task is done (future.isDone()).
        //
        //Cancel the task (future.cancel(true)).
        //
        //Block and get the result (future.get() → waits until the task finishes and returns the computed value).


    }

}
