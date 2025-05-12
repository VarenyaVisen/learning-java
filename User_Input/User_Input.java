package User_Input;

import java.util.Scanner;

public class User_Input {
    // User Input = reading input from the user
    // 2 classes to read user input: Scanner and BufferedReader
    // Scanner is easier to use and more flexible
    // BufferedReader is more efficient and faster
    // Scanner is a class in the java.util package
    // BufferedReader is a class in the java.io package
    // Scanner is a simple text scanner which can parse primitive types and strings using regular expressions.
    // BufferedReader is a character-input stream that buffers characters for efficient reading of text.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
        System.out.println("Are you a student?");
        boolean isStudent = sc.nextBoolean();
        System.out.println("What is your GPA?");
        double gpa = sc.nextDouble();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("Your GPA is " + gpa);
        sc.close();
    }
    
}
