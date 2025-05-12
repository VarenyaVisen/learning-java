package METHODS;
import java.util.Scanner;
public class check_age_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = sc.nextInt();

        if (ageCheck(age)) {
            System.out.println("You may sign up!!");
        }
        else{
            System.out.println("Sorry you can't sign up, you must be 18+");
        }

        sc.close();
    }
    // Method which verifies the age
    static boolean ageCheck(int age){
        if (age >= 18) {
            return true;
        }
        else{
            return false;
        }
    }
}
