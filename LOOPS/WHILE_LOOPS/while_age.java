package WHILE_LOOPS;

import java.util.Scanner;

public class while_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        
        System.out.print("Please enter your age : ");
        age = sc.nextInt();

        while (age < 0) {
            System.out.println("Your age cannot be negative!!");
            System.out.print("Please enter your age : ");
            age = sc.nextInt();
        }
        System.out.println("You are "+age+" years old!!");
        sc.close();
    }
}
