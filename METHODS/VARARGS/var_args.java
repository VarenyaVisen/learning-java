package METHODS.VARARGS;

public class var_args {
    public static void main(String[] args) {
        
        // varargs = allow methods to accept a varying number of arguments
        //           make methods more flexible, no need for overloaded methods 
        //           java will pack the arguments into an array 
        //           ...(ellipsis)
        System.out.println(add(1,2,3,4));
    }
    static int add(int... numbers){
        int sum = 0;
        for(int num:numbers){
            sum +=num;
        }
        return sum;
    }
}
