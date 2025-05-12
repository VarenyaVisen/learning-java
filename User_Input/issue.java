package User_Input;

import java.util.Scanner;

public class issue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We need to use sc.nextLine() to read the input after sc.nextInt() because sc.nextInt() does not read the newline character
        // This is a common issue when using Scanner to read input
        // We can fix this by using sc.nextLine() to read the input after sc.nextInt()
        // We can also use sc.next() to read the input after sc.nextInt()
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        sc.close();
    }
    
}
