package FILE_READ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_read {
    public static void main(String[] args) {
        
        // How to read a file using Java (3 Popular Options)

        // BufferedReader + FileReader : Best for reading text files line-by-line
        // FileInputStream : Best for binary files (e.g., images, audio files)
        // RandomAccessFile : Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\varen\\OneDrive\\Desktop\\test.txt";

        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));){
            System.out.println("That file exists");

            // Reading the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch(IOException e){
            System.out.println("Something went wrong!!");
        }
    }
}
