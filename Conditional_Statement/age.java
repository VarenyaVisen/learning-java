package Conditional_Statement;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("What is your age?");
        age = sc.nextInt();

        // Group - 1
        if (name.isEmpty()) {
            System.out.println("You did'nt entered your name 😤😡");
        }
        else{
            System.out.println("Hello ❤️ "+name);
        }
        // Group - 2
        if (age >= 65) {
            System.out.println("You're a senior");
        }
        else if (age >= 18) {
            System.out.println("You're an adult ");
        }
        else if (age == 0) {
            System.out.println("You're a baby");
        }
        else{
            System.out.println("You're a child");
        }

        sc.close();
    }
    
}
