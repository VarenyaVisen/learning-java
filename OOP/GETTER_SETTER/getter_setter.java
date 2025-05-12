package GETTER_SETTER;

public class getter_setter {
    public static void main(String[] args) {
        
        // They help protect object data and add rules for accessing or modifying their data
        // GETTERS = MethodS that make a feild READABLE
        // SETTERS = Methods that make a feild WRITABLE

        Car car = new Car("Charger", "Yellow", 10000);

        car.setModel("Mustang");
        car.setColor("Blue");
        car.setPrice(-100);

        // we will use the getter method that we created in Car class
        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());
    }
}
