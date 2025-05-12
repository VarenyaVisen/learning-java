package GENERICS;

public class Product <T,U>{// t and u because it is common conventions to store more data types inside an arraylist
    T item;  // we dont know if our item will be string or more complex item
    U price; // can be float integer we dont know

    // Constructor
    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    // Getter method
    public T getItem(){
        return this.item;
    }

    public U getprice(){
        return this.price;
    }
}
