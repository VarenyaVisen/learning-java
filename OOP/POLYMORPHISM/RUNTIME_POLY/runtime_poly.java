package POLYMORPHISM.RUNTIME_POLY;

import java.util.Scanner;

public class runtime_poly {
    public static void main(String[] args) {
        
        // Runtime(Dynamic) Polymorphism = When the method that gets executed is decided 
        //                        at runtime based on the actual type of the objects
        Scanner sc = new Scanner(System.in);

        Animal animal; // Animal object created but not instantiated

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();

    }
}
