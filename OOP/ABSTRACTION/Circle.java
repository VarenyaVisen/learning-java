package ABSTRACTION;

public class Circle extends Shape {

    double radius;

    // Constructor : To ensure no objects are left empty without an argument
    Circle(double radius){
        this.radius = radius;
    }

    // Abstract method that means children have to define it
    @Override
    double area(){
        return Math.PI * radius * radius;
    }

}
