package THREADING.MULTI_THREADING;

public class mult_thread {
    public static void main(String[] args) {
        
        // Multithreading : Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  useful for background tasks or time-consuming operations

        myRunnable mult = new myRunnable(); // Instead of creating a runnable object we can pass the anonymous runnable object directly to the thread object
        Thread thread1 = new Thread(mult);
        Thread thread2 = new Thread(new myRunnable());

        thread1.start();
        thread2.start();

    }
}
