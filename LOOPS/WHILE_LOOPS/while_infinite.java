package WHILE_LOOPS;

import java.util.Scanner;

public class while_infinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You're playing a game !!");
            System.out.println("Press Q to quit");
            response = sc.nextLine().toUpperCase();
        }
        System.out.println("You've quit the game!!");

        sc.close();
    }
}
