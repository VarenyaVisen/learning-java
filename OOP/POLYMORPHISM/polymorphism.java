package POLYMORPHISM;

public class polymorphism {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" : "MANY"
        //                "MORPH" : "SHAPE"
        //                 Objects can identify as other objects
        //                 Object can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        boat.go();
        car.go();
        bike.go();

        Vehicle[]  vehicles = {car,bike,boat};
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
