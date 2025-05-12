package Math_Class;

import java.util.Scanner;
public class hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the value of side A : ");
        a = sc.nextDouble();
        System.out.print("Enter the value of Side B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("The value of hypotenuse (Side C) is : "+c);

        sc.close();
    }
}
