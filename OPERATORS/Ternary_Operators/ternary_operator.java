package Ternary_Operators;

public class ternary_operator {
    public static void main(String[] args) {
        
        // Ternary Operator ? = returns 1 of 2 values if a condition is true

        // Variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
        String passOrFail = (score >=60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

    }
}
