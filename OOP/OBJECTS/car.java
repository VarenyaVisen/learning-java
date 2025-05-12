package OBJECTS;
public class car { // Here car is an object
    // Attributes are features car may have
    // Holding Data()
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    // Performing Action()
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the "+model);
    }

    void brake(){
        System.out.println("You brake the "+model);
    }
}
