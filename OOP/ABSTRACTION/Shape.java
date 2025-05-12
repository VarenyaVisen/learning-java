package ABSTRACTION;

// By adding abstract keyword : we cannot create an object using shape class
public abstract class Shape {

    abstract double area(); // ABSTRACT METHOD (NO BODY)

    // CONCRETE METHOD : ARE DEFINED AND INHERITED WITHIN THE ABSTRACT CLASS
    // WE DO NOT NEED TO OVERRIDE THIS METHOD IT IS INHERITED BY THE SUB-CLASSES
    void display(){
        System.out.println("This is a shape");
    }

}
