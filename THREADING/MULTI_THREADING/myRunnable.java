package THREADING.MULTI_THREADING;

public class myRunnable implements Runnable { // If we implement a interface its like we are signing a contract
                                              // we have to override new required methods
    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            try{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ " "+ i);// To get the names of the thread 

            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }

}
