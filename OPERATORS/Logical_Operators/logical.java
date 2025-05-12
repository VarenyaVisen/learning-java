package Logical_Operators;

public class logical {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = true;

        // AND = && with AND logical operator every condition should be true
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good today 😍");
            System.out.println("It is Sunny outside☀️");
        }
        // NOT = ! with NOT operator we can check if something is not true
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good today 😍");
            System.out.println("It is not Cloudy outside ⛅");
        }
        // OR = || It is similar to AND however only one condition needs to be true
        else if (temp > 30 || temp <0) {
            System.out.println("The Weather is bad😣");
        }
    }
}
