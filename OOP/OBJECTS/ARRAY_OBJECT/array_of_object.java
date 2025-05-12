package OBJECTS.ARRAY_OBJECT;

public class array_of_object {
    public static void main(String[] args) {
        // Array of objects

        cars car1 = new cars("Mustang", "Back");
        cars car2 = new cars("Lamborghini", "Red");
        cars car3 = new cars("BMW", "Yellow");

        // WE CAN ALSO CREATE ANONYMOUS OBJECTS IN ARRAYS
        cars[] CARS = {car1,car2,car3}; 

        cars[] gaadi = {new cars("xuv", "White"),
                        new cars("Innova", "Blue")};

        for(int i =0;i<CARS.length;i++){
            CARS[i].drive();
        }
        System.out.println("#####################");
        // Enhanced for loop
        for(cars car : CARS){
            car.drive();
        }
        System.out.println("#####################");

        for(int i = 0;i<gaadi.length;i++){
            gaadi[i].drive();
        }
        System.out.println("#####################");

        for(cars gaddi : gaadi){
            gaddi.drive();
        }
        System.out.println("#####################");

        // enhanced for loop to change the color of the car 
        for( cars gaddi : gaadi){
            gaddi.color = "neon";
        }
        
        for(cars gaddi : gaadi){
            gaddi.drive();
        }

    }
}
