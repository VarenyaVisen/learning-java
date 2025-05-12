package METHODS;

import java.util.Scanner;

public class square_method {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter the number you want to square : ");
        double number = sc.nextDouble();

        square(number);
        System.out.println(square(number));
        System.out.println(cube(number));

        sc.close();
    }

    // Normally if we do not return anything from a method we write void
    // Otherwise we write the datatype of what we are returning
    // Method : returns the square of the number provided to it
    static double square(double number){
        return number * number;
    }

    // Method :  returns cube if the number given
    static double cube(double num){
        return num * num * num;
    }

}
