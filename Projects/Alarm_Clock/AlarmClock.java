package Projects.Alarm_Clock;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// To create alarm clock objects
public class AlarmClock implements Runnable{ // To run on the seperate thread

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;

    // Our AlarmClock needs a alarm time 
    AlarmClock(LocalTime alarmTime , String filePath, Scanner sc){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }

    @Override
    public void run(){
        // When this alarm clock is run on a seperate thread it's going to execute any code in run method
        
        // Instead of creating an object of LocalTime we get time eery second and compare it to our alarm time
        while (LocalTime.now().isBefore(alarmTime)) {
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();
                // We can make our code more concise by using these above methods directly inside print statement
                // System.out.println(hours+":"+minutes+":"+seconds);
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);// \r : carriage return = moves the cursor to the beginning of the line
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }           
        }
        System.out.println("\n *ALARM NOISES*");
        playSound(filePath);
    }
    // Making private method to play audio so that only our AlarmClock can access it
    private void playSound(String filePath){
        // Making file object
        File audioFile = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            // CLIP OBJECT : It access a player that plays audio stream
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press Enter to stop the alarm : ");
            sc.nextLine();
            clip.stop();
            sc.close();
            
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }catch(LineUnavailableException e){ // if audio is unavailable for some reason
            System.out.println();
        }catch(IOException e){ // Act as a safety net 
            System.out.println("Error reading audio file!!");
        }

    }
}
