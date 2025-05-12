package ARRAY.user_input;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String foods[] = new String[size];

        for(int i = 0;i<foods.length;i++){
            System.out.print("Enter a food : ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods){
            System.out.print(food+" ");
        }

        sc.close();
    }
}
