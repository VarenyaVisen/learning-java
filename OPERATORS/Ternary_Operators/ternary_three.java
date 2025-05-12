package Ternary_Operators;

import java.util.Scanner;

public class ternary_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income : ");
        int income = sc.nextInt();

        double taxRate = (income >= 40000)? 0.25 : 0.15;

        System.out.println("Your Tax Rate is : "+taxRate);

        sc.close();
    }
}
