package Conditional_Statement.Enhanced_Switch;

import java.util.Scanner;

public class calclulator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // Variables we will need
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validoOperation = true;

        // Taking User Input
        System.out.print("Please enter the first number : ");
        num1 = sc.nextDouble();

        System.out.print("Please enter the operator (+ ,- ,* ,/ ,^ ) : ");
        operator = sc.next().charAt(0);

        System.out.print("Please enter the second number : ");
        num2 = sc.nextDouble();
        
        // Calculator Program using switch cases
        // The operators will be in single quotes beacause we are working with char not strings
        switch(operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            // Improvising the code
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validoOperation = false;
                }
                else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!!");
                validoOperation = false;
            }

        }
        // We will print the result only if the validOperation is true
        if (validoOperation) {
            System.out.println("The answer is : "+result);
        }

        sc.close();
    }
}
