package GENERICS;

public class exp_generic {
    public static void main(String[] args) {

        // Compatible with different data types we just have to use a type argument when creating a box object
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Product <String, Double> product1 = new Product<String,Double>("apple", 0.50);
        Product <String, Integer> product2 = new Product<String,Integer>("Ticket", 15);

        
        System.out.println(product1.getItem());
        System.out.println(product1.getprice());

        System.out.println(product2.getItem());
        System.out.println(product2.getprice());
    }
}
