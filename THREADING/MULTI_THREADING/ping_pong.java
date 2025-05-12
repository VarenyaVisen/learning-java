package THREADING.MULTI_THREADING;

public class ping_pong {
    public static void main(String[] args) {
        

        // Making runnable object
        pingRunnable ball1 = new pingRunnable("PING");

        pingRunnable ball2 = new pingRunnable("PONG");

        Thread thread1 = new Thread(ball1);
        Thread thread2 = new Thread(ball2);

        System.out.println("GAME START!");
        thread1.start();
        thread2.start();

        try{ // We can make our main thread wait for letting others thread to complete by using thread.join()
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
