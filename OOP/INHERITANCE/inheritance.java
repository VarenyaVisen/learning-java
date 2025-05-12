package INHERITANCE;

public class inheritance {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods 
        //               from another class.
        //               Child <- Parent (a child inherits traits from their parent)
        dog Dog = new dog();
        cat Cat = new cat();

        System.out.println(Dog.isAlive);
        System.out.println(Cat.isAlive);
        Dog.eat("judo");
        Cat.eat("nancy");

        System.out.println("The number of lives dog have is : "+Dog.lives);
        Dog.speak();

        System.out.println("The number of lives dog have is : "+Cat.lives);
        Cat.speak();
    }
}
