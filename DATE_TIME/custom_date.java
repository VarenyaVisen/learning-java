package DATE_TIME;

import java.time.LocalDateTime;

public class custom_date {
    public static void main(String[] args) {
        // Custom DateTime Object

        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(date1);

        // Similarly it can be done with others date and time objects

        // We can compare two date too
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(date2);

        // comparing
        if (date1.isBefore(date2)) {
            System.out.println(date1+" is earlier than "+date2);
        }
        else if (date1.isAfter(date2)) {
            System.out.println(date1+" is later than "+date2);
        }

        // We can also check whether the dates are equal or not
        // By using built in isEqual() method

        else if (date1.isEqual(date2)) {
            System.out.println(date1+" is equal to "+date2);
        }


    }
}
