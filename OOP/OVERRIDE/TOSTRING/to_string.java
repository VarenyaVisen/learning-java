package OVERRIDE.TOSTRING;

public class to_string {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from Object class.
        //               used to return a string representation of an object.
        //               By default, It returns a hash code  a unique identifier.
        //               It can be overridden to provide meaningful details.

        car car1 = new car("Ford", "Mustang", "Red", 2025);
        car car2 = new car("Chevrolet", "Corvette", "Blue", 2026);
        // Hashing =  A unique identifier that uses the objects memory address to calculate the hash
        System.out.println(car1);
        // We have to format like this to get desirable output thats why we use toString() to override
        // because by default toString method returns the hash code
        System.out.println(car1.color+" "+car1.year+" "+car1.model+" "+car1.make);

        System.out.println(car1);
        System.out.println(car2);

    }
}
