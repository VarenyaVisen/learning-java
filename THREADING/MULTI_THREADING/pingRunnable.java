package THREADING.MULTI_THREADING;

public class pingRunnable implements Runnable{

    private final String text;

    pingRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }

}
