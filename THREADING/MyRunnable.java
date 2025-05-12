package THREADING;

public class MyRunnable implements Runnable {

    @Override
    public void run(){
        // In this run we are going to add any code we want to run on the background on a seperate thread
        for(int i = 1;i<=10;i++){
            try{
                Thread.sleep(1000); // Consider dangerous code : use try catch block
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if (i == 10) {
                System.out.println("Times Up!");
                System.exit(0);
            }
        }
    }

}
