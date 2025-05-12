package ABSTRACTION;

public class abstract_java {
    public static void main(String[] args) {
        // Note : we can make classes and methods abstract using abstract keyword
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details 
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can't contain 'abstract' methods (which must be implemented)
        //            Can't contain 'concrete' methods (which are inherited)

        // We don't want people to create shape object it's too generic
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        // This Concrete method display was inherited by these subclasses
        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        
    }
}
