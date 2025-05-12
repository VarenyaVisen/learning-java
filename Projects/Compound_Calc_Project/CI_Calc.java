package Projects.Compound_Calc_Project;
import java.util.Scanner;
public class CI_Calc {
    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner sc = new Scanner(System.in);


        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount : ");
        principal = sc.nextDouble();

        System.out.println("Enter the interest rate (in %) : ");
        rate = sc.nextDouble()/100;

        System.out.println("Enter the number of times compounded per year : ");
        timesCompound = sc.nextInt();

        System.out.println("Enter the number of years : ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompound, timesCompound*years);

        System.out.println("The amount after "+ years + " years is $"+amount);
        System.out.printf("The amount after %d years is $%.2f", years,amount);


        sc.close();
    }
}
