package Nested_Loops;

import java.util.Scanner;

public class nested_proeject {
    // Project : we will make a matrice of symbol provided by the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaring variables
        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        columns = sc.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);

        // Outer for loop is incharge for rows
        // Inner for loop is incharge for columns
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=columns;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }


        sc.close();
    }
    
}
