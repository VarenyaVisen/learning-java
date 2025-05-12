package COMPOSITION;

public class composition {
    public static void main(String[] args) {
        // Composition : Represents a "part-of" relationship between objects
        //               for example, an engine is "Part of" a car.
        //               Allows complex objects to be constructed from smaller objects
        // Composition: "part-of" relationship where parts cannot exist independently

        Car car = new Car("Corvette", 2025, "v8");
        // if we delete our car object the engine will also be deleted because engine is a part of a car
        System.out.println(car.model);
        System.out.println(car.year );
        System.out.println(car.engine); // Our engine is an object a reference datatype it putputs the hash ID
        System.out.println(car.engine.type);// we use dot access modifier

        car.engine.start();
        car.start();
    }
}
