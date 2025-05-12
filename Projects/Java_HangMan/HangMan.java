package Projects.Java_HangMan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        
        // JAVA HANGMAN GAME

        String filePath = "C:\\Users\\varen\\OneDrive\\Desktop\\Java\\Projects\\Java_HangMan\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim()); // .trim() this method was used to trim any whitespace
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }
        catch(IOException e){
            System.out.println("Something went wrong!!");
        }
        
        Random random = new Random();
        String word = words.get(random.nextInt(words.size())); 
        

        Scanner sc = new Scanner(System.in);
        // We cant use primitive so we use wrapper class 
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0;i<word.length();i++){
            wordState.add('_');
        
        }
        System.out.println("***********************");
        System.out.println("WELCOME TO JAVA HANGMAN");
        System.out.println("***********************");

        while(wrongGuesses < 6){

            System.out.print(getHangmanArt(wrongGuesses));

            System.out.print("Word : ");

            for(char c : wordState){
            System.out.print(c+" ");
            }
            System.out.println();

            System.out.print("Guess a letter : ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct Guess!!");

                for(int i = 0 ; i < word.length() ; i++){
                    if(word.charAt(i) == guess){
                    wordState.set(i, guess);
                }
                if(!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!!");
                    System.out.println("The word was : "+word);
                    break;
                }

            }
        }
        else{
            wrongGuesses++;
            System.out.println("Wrong guess!!");
        }

        }
        if (wrongGuesses >= 6) {
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!!!");
            System.out.println("The word was : "+ word);
        }

        sc.close();
        
    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 ->"""
                    


                     """;
            case 1 ->"""
                      0

            
                     """;
            case 2 ->"""
                      0
                      |  
            
                     """;
            case 3 ->"""
                      0
                     /|  
              
                     """;
            case 4 ->"""
                      0
                     /|\\

                     """;
            case 5 ->"""
                      0                    
                     /|\\  
                     /
                     """;
            case 6 ->"""
                      0
                     /|\\
                     / \\  
                     """;
            default -> "";
        };
    }
}
