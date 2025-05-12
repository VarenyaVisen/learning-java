package METHODS;

public class method {

    // Methods are made outside the main class
    // Methods are unfamiliar with any variables declared in other methods

    // Parameters are variables defined in method declaration
    // We need parameters to read the arguments sent to the method
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy Birthday to you\n");
    }

    public static void main(String[] args) {
        
        // Method = a block of reusable code that is executed when called ()
        // Task :  Sing Happy Birthday 3 times D.R.Y = Do not repeat yourself
        
        String name = "bro";
        int age = 22;
        // Calling a method
        // Arguments are the actual values passed to the method
        happyBirthday(name, age);
        // Matching set of parameters and arguments

    }
    
}
