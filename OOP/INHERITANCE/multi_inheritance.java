package INHERITANCE;

public class multi_inheritance {
    public static void main(String[] args) {
         // Inheritance = One class inherits the attributes and methods 
        //               from another class.
        //               Child <- Parent -> Grand parent

        // Here : Dog and Cat inherits from animal and animal inherits from organism
        dog Dog1 = new dog();
        cat Cat1 = new cat();
        Plants  plant = new Plants();

        System.out.println(Dog1.isAlive);
        System.out.println(Cat1.isAlive);
        System.out.println(plant.isAlive);

        Dog1.eat("choco");
        Cat1.eat("coco");
        plant.photosynthesis();

    }
}
