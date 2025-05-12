package FILE_WRITE;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class file_read {
    public static void main(String[] args) {
        
        // How to write a file using Java(4 Popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g, images, audio files)

        //This is a dangerous code so we will put it inside try and catch block
                                               // This is the location where you wanna store your file
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like pizza!\nIts really good!!");
            System.out.println("The file has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location ");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

        // NOTE : If you want to make it more clean you can put the file location in seperate variable
        // We can also put the input text in a variavle that will be passed into the writer

    }
}
