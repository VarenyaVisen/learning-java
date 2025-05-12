package TIMER_TASK;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_Tasks {
    public static void main(String[] args) {
        
        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for : sending notifications, schedule updates, repetitive actions
        
        // TimerTask = Represents the task that will be executed by the timer 
        //             You will extend the TimerTask to Define your task
        //             Create a subclass of TimerTask and @Override run()
        // Task which is going to execute when our timer said 

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");
                count --;
                if (count <= 0) {
                    System.out.println("TASK COMPLETE!!");
                    timer.cancel();
                }
            }
        };
    
        timer.schedule(task, 1000,1000);// (task,delay,period)

    }
}
