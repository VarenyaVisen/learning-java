package METHODS.Overload;

import java.util.Scanner;
public class pizza_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pizza;
        String cheese;
        String topping;
        System.out.println("What kind of pizza do you want? : ");
        pizza = sc.nextLine();
        System.out.println("What kind of cheese do you want? : ");
        cheese = sc.nextLine();
        System.out.println("What toppings do you want? : ");
        topping = sc.nextLine();

        System.out.println(bakePizza(pizza,cheese,topping));

        sc.close();
    }
    // Methods can have same name but they need to have a different set of parameters
    // We will make a method to bake a pizza
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese+" "+bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String  toppings){
        return toppings+" "+cheese+" "+bread + " pizza";
    }
}
