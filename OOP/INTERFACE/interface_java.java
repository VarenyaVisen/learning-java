package INTERFACE;

public class interface_java {
    
    // Interface = A blueprint for a class that specifies a set of abstract methods 
    //             that implementing classes MUST define 
    //             Supports multiple inheritance-like behaviour

    // Usually using inheritance(extends) a class can have only one parent but using interfaces
    // a class can have multiple parents
    public static void main(String[] args) {
         
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // Here you can see fish object inherits the 2 classes of prey and predator
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
