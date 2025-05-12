package User_Input.shopping_cart;
import java.util.Scanner;
public class cart {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM
        Scanner sc = new Scanner(System.in);

        String items;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item do you want?");
        items = sc.nextLine();
        System.out.println("what is the price for each?");
        price = sc.nextDouble();
        System.out.println("How many would you like?");
        quantity = sc.nextInt();
        total = price * quantity;
        System.out.println("\nyou have bought "+quantity+" "+items+"/s");
        System.out.println("The Total price will be "+currency+total);


        sc.close();
    }
    
}
