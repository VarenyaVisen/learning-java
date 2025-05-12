package Projects.Slot_Machine;

import java.util.Random;
import java.util.Scanner;

public class java_slot_machine {
    public static void main(String[] args) {
        
        // JAVA SLOT MACHINE

        Scanner sc = new Scanner(System.in);

        // DECLARE ARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String playAgain = "yes";
        String[] row; // This array will hold emojis

        
     
         // DISPLAY WELCOME MESSAGE
        System.out.println("---------------------------------");
        System.out.println("### WELCOME TO JAVA SLOTS ###");
        System.out.println("   SYMBOLS : 🍒 ⭐ 🍉 ⛅ 🧁   ");
        System.out.println("---------------------------------");
        
        // PLAY IF BALANCE > 0
        while (balance>0) {
            System.out.println("Current balance : $"+balance);
            // ENTER BET AMOUNT
            System.out.print("Place your bet : ");
            bet = sc.nextInt();
            sc.nextLine();

            // VERIFY IF BET > BALANCE
            if (bet>balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            // VERIFY IF BET > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            // SUBTRACT BET FROM BALANCE
            else{
                balance -= bet;
                // System.out.println("$"+balance);
            }

            // SPIN ROWS
            System.out.println("Spinning...");
            row = spinRow();

            // PRINT ROW
            printRow(row);

            // GET PAYOUT
            payout = getPayout(row,bet);
            if (payout>0) {
                System.out.println("You Won : $"+payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost!!");
                System.out.println("Balance ; $"+balance);
            }

            // ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (Y/N) : ");
            playAgain = sc.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
                
            }
        }


        // DISPLAY EXIT MESSAGE
        System.out.println("##########");
        System.out.println("GAME OVER!");
        System.out.println("##########");
        // System.out.println("Your final balance is : $"+balance);
        System.out.println("##########");


        sc.close();

    }

    // Row Spin Method
    static String[] spinRow(){
        String[] symbols = {"🍒", "⭐", "🍉", "⛅", "🧁"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0;i<3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" "+String.join(" | ",row));
        System.out.println("**************");

    }

    static int getPayout(String[] row,int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]){
                case "🍒" -> 4*bet;
                case "🧁" -> 8*bet;
                case "🍉" -> 10*bet;
                case "⛅" -> 20*bet;
                case "⭐" -> 40*bet;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch(row[0]){
                case "🍒" -> 2*bet;
                case "🧁" -> 4*bet;
                case "🍉" -> 5*bet;
                case "⛅" -> 10*bet;
                case "⭐" -> 20*bet;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch(row[1]){
                case "🍒" -> 2*bet;
                case "🧁" -> 4*bet;
                case "🍉" -> 5*bet;
                case "⛅" -> 10*bet;
                case "⭐" -> 20*bet;
                default -> 0;
            };
        }
        return 0;
    }


}
