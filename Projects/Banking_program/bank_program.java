package Projects.Banking_program;

import java.util.Scanner;

public class bank_program {

    // Declaring scanner in class so that every method can access it
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        // BANKING PROGRAM PROJECT JAVA

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;
        // we want this program to run as long as isRunning is true

        while (isRunning) {
            // DISPLAY MENU
        System.out.println("***************"); 
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************"); 

        // GET AND PROCESS USERS CHOICE 
        System.out.print("Enter your choice (1-4) : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1 ->{
                showBalance(balance);
                Thread.sleep(1000);
            } 
            case 2 -> {
                balance += deposit();
                Thread.sleep(1000);
            }
            case 3 -> {
                balance -= withdraw(balance);
                Thread.sleep(1000);
            }
            case 4 -> {
                System.out.println("Exiting the banking program");
                isRunning = false;
            }
            default -> {
                System.out.println("Invalid Choice");
                Thread.sleep(1000);
            } 
            
        }
            
        }

        // exit message 4
        System.out.println("###########################");
        System.out.println("Thank you have a nice day!!");
        System.out.println("###########################");
        sc.close();
    }
    // Method : showBalance() 1 no return type
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    // Method : deposit() 2
    static double deposit(){
        double amount;// Local variable
        System.out.print("Enter an amount to be deposited : ");
        amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }

    // Method : withdraw() 3
    static double withdraw(double balance){
        double amount; // Local

        System.out.print("Enter amount to be withdrawn : ");
        amount = sc.nextDouble(); 

        if (amount>balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
        
    }
}
