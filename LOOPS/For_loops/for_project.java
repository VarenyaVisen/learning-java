package For_loops;

import java.util.Scanner;

public class for_project {
    // We add the InterruptedException to throw the exception if our thread is interrupted : INTERMEDIATE JAVA
    public static void main(String[] args) throws InterruptedException{

        Scanner sc = new Scanner(System.in);
        // Countdown
        System.out.println("How many seconds to countdown from? : ");
        int start = sc.nextInt();

        for(int i = start; i>0; i--){
            System.out.println(i);
            // We can use thread class to have our program sleep for some time : ADVANCE JAVA
            Thread.sleep(1000);// The time is in milli second
        }

        System.out.println("HAPPY NEW YEAR !!!");
        sc.close();
    }
}
