package WHILE_LOOPS;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        
        // While loop = repeat some code forever 
        //              while some condition remains true 

        Scanner sc = new Scanner(System.in);
        String name = "";

        // Using if statement there is a problem if we did'nt enter any name it outputs empty name
        while (name.isEmpty()) {
            System.out.println("Enter your name : ");
            name = sc.nextLine();
        }

        System.out.println("Hello "+name);


        sc.close();
    }
}
