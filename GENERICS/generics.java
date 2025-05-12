package GENERICS;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types
        //            <T> type parameter (placeholder that gets replaced with real type)
        //            <String> type argument (specifies the type)

        // Generally speaking an ArrayList data structure can store all sorts of different datatypes
        // But when we create one we have to specify what we are storing : thats the type argument
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
    }
}
