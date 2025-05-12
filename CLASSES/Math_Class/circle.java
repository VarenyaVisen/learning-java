package Math_Class;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Value of radius : ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The circumference is : "+circumference+"cm");
        System.out.println("The area is : "+area+"cm²");
        System.out.println("The volume is : "+volume+"cm³");
        System.out.println();
        System.out.println("\"To print 2 decimal points we use printf\"");
        System.out.println();
        // To print 1 digit after the decimal 
        System.out.printf("The circumference is : %.2fcm\n",circumference);
        System.out.printf("The area is : %.2fcm²\n",area);
        System.out.printf("The volume is : %.2fcm³\n",volume);
        sc.close();
    }
}
