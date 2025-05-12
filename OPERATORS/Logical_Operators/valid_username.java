package Logical_Operators;

import java.util.Scanner;

public class valid_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        // RULES
        String username;

        System.out.println("Enter your new username : ");
        username = sc.nextLine();

        // Condition to check username size
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters!!");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscore!!");
        }
        else{
            System.out.println("Welcome "+username);
        }
        

        sc.close();
    }
}
