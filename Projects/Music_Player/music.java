package Projects.Music_Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class music {
    public static void main(String[] args) {
        
        // How to PLAY AUDIO with Java (.wav, .au, .aiff)
        String filePath = "C:\\Users\\varen\\OneDrive\\Desktop\\song.wav";
        File file = new File(filePath);

        // We can use try with resources if an object implements the AutoClosable interface
        // Audio input stream object to play the song
        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip  clip = AudioSystem.getClip(); // Clip : A music or sound player, it allows us to load an audio file(play, pause, stop)

            clip.open(audioStream); // clip object calling open method to open our audio file which is stored inside audtioStream
            // Note : the code is not waiting for the audio to get finished
            // We can use thread to encounter this problem but we will use different method

            String response= "";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");
                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could no locate the file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        } 
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio reource");
        }   
        catch(IOException e){
            System.out.println("Something went wrong"); // This last catch ast as a safety net
        }
        finally{
            System.out.println("Closing our music player");
            System.out.println("!BYEEEEE");
        }

    }
}
