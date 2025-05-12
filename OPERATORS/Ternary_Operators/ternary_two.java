package Ternary_Operators;

import java.util.Scanner;

public class ternary_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = sc.nextInt();

        String oddOrEven = (num%2 == 0)? "EVEN" : "ODD";
        System.out.println("Your number is : "+oddOrEven);

        sc.close();
    }
}
