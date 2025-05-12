package DATE_TIME;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_fromat {
    public static void main(String[] args) {
        
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime); 

    }
}
