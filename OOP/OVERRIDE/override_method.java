package OVERRIDE;

public class override_method {

    public static void main(String[] args) {
    // Method Overriding = When a subclass provides it's own 
    //                     implementation of a method that is already defined.
    //                     Allows for code reusability and give specific implementations


    dog dog1 = new dog();
    cat cat1 = new cat();
    fish fish1 = new fish();

    dog1.move();
    cat1.move();
    fish1.move();

        
    } 

}
