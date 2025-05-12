package My_First_Program;

public class variable {
    public static void main(String[] args) {
        // variable = a container that stores a value
        // primitive data types = int, double, char, boolean
        // reference data types = String, Array
        // A primitive data type specifies the size and type of variable values, and it
        // has no additional methods.
        // A reference data type is a non-primitive data type which contains the address
        // of the variable values.

        // Two steps to create a variable:
        // 1. Declaration: int x;
        // 2. Assignment: x = 10;

        // int = integer
        int age = 21;
        System.out.println("You are " + age + " years old");
        // double = floating point number
        double gpa = 2.5;
        System.out.println("Your GPA is " + gpa);
        // char = character
        char grade = 'A';
        System.out.println("Your grade is " + grade);
        // boolean = true or false
        boolean isAdult = true;
        System.out.println("Are you an adult? " + isAdult);

        // String = a sequence of characters
        String name = "Varenya";
        System.out.println("My name is " + name);

        // array = a container that stores multiple values of the same type
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(numbers[0]);
    }

}
