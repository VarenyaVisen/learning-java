package Arithmetic_Operators;

public class arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z;
        z = x+y;
        System.out.println("Addition : "+z);
        z = x-y;
        System.out.println("Subtraction : "+z);
        z = x*y;
        System.out.println("Multiplication : "+z);
        z = x/y;
        System.out.println("Division : "+z);
        z = x%y;
        System.out.println("Modulus : "+z);
        System.out.println("Augmented Assignment operators : ");
        x+=y;
        System.out.println(x);

        System.out.println("Increment and decrement operators");
        int a = 1;
        int b = 10;
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);
    }
    
}
