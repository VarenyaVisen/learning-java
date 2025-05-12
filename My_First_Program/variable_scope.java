package My_First_Program;

public class variable_scope {

    // CLASS
    // Class variables are declared inside a class
    /*Class variables:
    1. Available throughout the class
    2. Have default values if not initialized
    3. Can be accessed by all methods in the class */
    static int a = 3;
    public static void main(String[] args) {
        // Variable Scope : where a variable can be accessed : Local and Class
        // Note: local variable is considered first rather then class variable
        // we use class variables when working with constants and OOPS concept


        // LOCAL
        // Local variables are declared inside a method
        /*Local variables:
        1.Only exist in their method/block
        2.Must be initialized before use
        3.Can't be accessed outside their scope */
        int x = 1;// LOCAL
        System.out.println(x+a);
        doSomething();
    }
    static void doSomething(){
        int x = 2;// LOCAL
        System.out.println(x+a);
    }
}
