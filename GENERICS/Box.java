package GENERICS;

public class Box<T> { // T : is a common convention meaning type 

    // Box is act like a container which means it will be reusable
    // We won't know what will be the type of tha element stored in it so
    T item; // we dont know what the type is going to be

    // We can put things in our box
    public void setItem(T item){
        this.item = item;
    }

    // We are going to return an item the datatype is T so the return tYpe is also going to be T

    // we can get things from our box
    public T getItem(){
         return this.item;
    }
}
 