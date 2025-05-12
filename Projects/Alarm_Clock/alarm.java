package Projects.Alarm_Clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {
        
        // JAVA ALARM CLOCK
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // When user us sc to enter the time we use formatter to parse it into time object
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\varen\\OneDrive\\Desktop\\song.wav";

        while (alarmTime == null) { // While loop : to let user write the alarm time until it is not written in proper format
            try{
                System.out.print("Enter an alarm time (HH:MM:SS) : ");
                String inputTime = sc.nextLine();
    
                // Parsing the time using formatter and assigning it to alarm clock
                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for : "+alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS!!");
            }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, sc);
        Thread alarmThread = new Thread(alarmClock); // We can do this because AlarmClock implements the runnable interface
        alarmThread.start();    


    }

}
