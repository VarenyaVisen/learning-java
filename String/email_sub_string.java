package String;

import java.util.Scanner;

public class email_sub_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;
        System.out.print("Enter your email address : ");
        email = sc.nextLine();

        if (email.contains("@")) {
            username = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Your Username is : "+username);
        System.out.println("Your Domain name is : "+domain);
        }
        else{
            System.out.println("Please enter a valid email address");
        }


        sc.close();
    }
}
