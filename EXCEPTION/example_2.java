package EXCEPTION;

import java.util.Scanner;

public class example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter A NUMBER : ");
            int num =  sc.nextInt();
            System.out.println(num);
        }
        // SAFETY NET IT CATCHES ALL THE EXCEPTIONS
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            sc.close();
            System.out.println("This will always execute");
        }

        // EXCEPTION HANDLING USING RESOURCES
        // if we use the scanner class inside a try block it automatically closes the scanner class
        
    }
}
