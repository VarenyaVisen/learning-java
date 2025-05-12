package EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example_1 {
    public static void main(String[] args) {

        // This try catch block helps the user to handle the exceptions gracefully

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            System.out.println(num);
        }catch(InputMismatchException e){
            System.out.println("That was'nt a number");
        }
    
        sc.close();

    
    }
}
