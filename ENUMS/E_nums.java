package ENUMS;

import java.util.Scanner;

public class E_nums {
    public static void main(String[] args) {
        
        // Enums = (Enumerations) A special kind of class that
        //          represents a fixed set of constants
        //          They improve code readability and are easy to maintain
        //          More efficient with switches rather than comparing Strings
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week : ");
        String response = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

        // Using Enums constants withun a switch is faster than using a string
        // We can use int instead but enums increases readability
            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     FRIDAY -> System.out.println("It is a week day");
                case SATURDAY,SUNDAY -> System.out.println("It is a weekend!");
                default -> System.out.println("Invalid input!!");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!!");
        }
        

        sc.close();
    }
}
