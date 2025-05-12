package ABSTRACTION;

public class Triangle extends Shape{

    double base;
    double height;

    // Constructor : To ensure no objects are left empty without an argument
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // Abstract method that means children have to define it

    @Override
    double area(){
        return 0.5 * base * height;
    }

}
