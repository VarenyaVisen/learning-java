package Projects.Weight_Converter;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        
        //WEIGHT CONVERSION PROGRAM

        Scanner sc = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("\" Weight Conversion Program \"");
        System.out.println("1 : converts lbs to kgs");
        System.out.println("2 : converts kgs to lbs");

        // Prompt for userinput
        System.out.print("Choose an option : ");
        choice = sc.nextInt();

        // Option 1 converts lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs : ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f",newWeight);
        }
        // Option 2 converts kgs to lbs
        else if(choice == 2){
            System.out.print("Enter the weight in kgs : ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f",newWeight);
        }
        // else print : Not a valid choice
        else{
            System.out.println("Not a valid choice please try again");
        }

        sc.close();
    }
}
