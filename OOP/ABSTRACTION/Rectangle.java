package ABSTRACTION;

public class Rectangle extends Shape{

    double length;
    double breadth;

    // Constructor : To ensure no objects are left empty without an argument
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;

    }

    // Abstract method that means children have to define it

    @Override
    double area(){
        return length * breadth;
    }

}
