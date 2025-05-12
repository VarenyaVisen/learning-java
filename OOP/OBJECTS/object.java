package OBJECTS;
public class object {
    public static void main(String[] args) {
        
    // Object = An entity that holds data (attributes)
    //          and can perform actions (methods)
    //          it is a reference data type (store data for an object in heap)


    // Now creating objecct for our car class
    // One problem : if we make more objects they all will have same attributes
    car CAR = new car();

    // If we print our CAR directly we get the address from heap
    System.out.println(CAR); 

    // Now we will use (objectName.attributeName) method to get things done

    // we can modify and change the attribute too

    System.out.println(CAR.make);
    System.out.println(CAR.model);
    System.out.println(CAR.year);
    System.out.println("$"+CAR.price);

    // Using Methods now
    // To call a method we use (objectName.methodNmae())
    System.out.println("I car runnig? : "+CAR.isRunning);
    CAR.start();
    System.out.println("I car runnig? : "+CAR.isRunning);
    CAR.stop();
    System.out.println("I car runnig? : "+CAR.isRunning);

    }
}
