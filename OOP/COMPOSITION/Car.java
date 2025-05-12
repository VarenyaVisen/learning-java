package COMPOSITION;

public class Car {

    String model;
    int year;
    Engine engine; // object

    // Constructor
    Car(String model, int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // When constrcuting a car object we will also be constructing the engine object
    }

    void start(){
        this.engine.start();
        System.out.println("The "+this.model + " is running");
    }
}
