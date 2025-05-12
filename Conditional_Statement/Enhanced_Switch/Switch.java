package Conditional_Statement.Enhanced_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day : ");
        String day = sc.nextLine();
        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();
        System.out.println(day);
        // Enhanced Switch = A replacement to many else if statements (Java14 feature)

        switch (day) {
            case "Monday" -> System.out.println("It is a weekday😤");
            case "Tuesday" -> System.out.println("It is a weekday😤");
            case "Wednesday" -> System.out.println("It is a weekday😤");
            case "Thursday" -> System.out.println("It is a weekday😤");
            case "Friday" -> System.out.println("It is a weekday😤");
            case "Saturday" -> System.out.println("It is the weekend😁");
            case "Sunday" -> System.out.println("It is the weekend😁");
            default -> System.out.println(day+ " is not a day.");
        }

        sc.close();
    }
}
