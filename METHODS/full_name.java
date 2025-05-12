package METHODS;

import java.util.Scanner;

public class full_name {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter your first name : ");
        firstName = sc.nextLine();

        System.out.println("Enter your last name : ");
        lastName = sc.nextLine();

        System.out.println("Your full name is : "+getFullName(firstName, lastName));
        sc.close();
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }
}
