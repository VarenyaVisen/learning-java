package Projects.Rock_Paper_Scissor;

import java.util.Random;
import java.util.Scanner;

public class rps_game {
    public static void main(String[] args) {
        
        // ROCK PAPER SCISSOR GAME 

        // DECLARE VARIABLES
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // GET CHOICE FROM THE USER 
        System.out.print("Enter your move (rock,paper,scissors): ");
        playerChoice = sc.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("scissors") && !playerChoice.equals("paper")) {
            System.out.println("Invalid Choice!!");
            continue;
        }

        // GET RANDOM CHOICE FOR THE COMPUTER
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer Choice : "+computerChoice);

        // CHECK WIN CONDITION
        if (playerChoice.equals(computerChoice)) { // we cannot use(==) becuz then we will be comparing memory addresses
            System.out.println("Its' a Tie");
        }
        // We can use OR operator to combine all else-if statement
        else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You Win!!");
        }
        else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You Win!!");
        }
        else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You Win!!");
        }
        else{
            System.out.println("You Lose!!");
        }
        // ASK TO PLAY AGAIN
        System.out.print("Play again (yes or no) : ");
        playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));
        
        // GOODBYE MESSAGE
        System.out.println("Thanks for playing<3");
        sc.close();
    }
}
