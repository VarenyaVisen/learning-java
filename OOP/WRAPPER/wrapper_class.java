package WRAPPER;

public class wrapper_class {
    public static void main(String[] args) {
        
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in a object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of collections Framework and static Utility Methods


        // Integer a = new Integer(123); // Old Version deprecated
        // Double b = new Double(3.14);
        // Character c = new Character('%');
        // Boolean d = new Boolean(true);

        // Modern method using autoboxing
        // Directly assigning a value to an object using wrapper class
        Integer a = 123; 
        Double b = 3.14;
        Character c ='$';       // These are all reference data type
        Boolean d = true;
        String e = "Pizza";

        // Unboxing : Opening the christmas present
        int x = a;

        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
