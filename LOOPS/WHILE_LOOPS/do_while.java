package WHILE_LOOPS;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        // In do-while loop we do some code first and then check the condition  

        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter your age : ");
        age = sc.nextInt();

        do{
            System.out.println("Your age can't be negative !!");
            System.out.println("Enter your age : ");
            age = sc.nextInt();
        }while(age<0);

        sc.close();
    }
}
