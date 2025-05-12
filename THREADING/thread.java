package THREADING;

import java.util.Scanner;

public class thread {
    public static void main(String[] args) {
        
        // Threading : Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations 
        //             (File I/, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend a Thread class (Simpler)
        // Option 2. Implement the Runnable interface (Better) because we are not limited by single inheritance

        Scanner sc = new Scanner(System.in);
        
        // Note : This code doe'nt work because everything runs on main thread and the program waits
        // for the main thread to get executed we will use runnable interface to run the tasks simultaneously without any interruptions
        System.out.println("You have 5 seconds to enter your name");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // A daemon thread will end if the main thread is done 
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);


        sc.close();

    }
}
