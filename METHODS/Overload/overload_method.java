package METHODS.Overload;

public class overload_method {
    public static void main(String[] args) {
        // overload methods =  methods that share the same name, 
        //                     but different parameters
        //                     signature =  name + parameters (each method signature needs to be unique)
        //                                  (but they can share same name)
        System.out.println(add(1, 2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
    }
    // These three method share the same name but have differenet parameters
    /*Method overloading is when you create multiple methods with the same name but different parameters.
     Think of it like having multiple versions of the same tool for different situations. */
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }
}
