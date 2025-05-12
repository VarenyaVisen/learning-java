package WHILE_LOOPS;

import java.util.Scanner;

public class num_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do{
            System.out.println("Please enter a number between 1-10 : ");
            num = sc.nextInt();
        }while(num < 0 || num > 10);
        System.out.println("You've picked "+num);
        sc.close();
    }
}
