package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        
        // ArrayList =  A resizable array that stores objects (autoboxing).
        //              Arrays are fixed in size, but ArrayLists can change 

        // We use appropriate wrapper class to store primitives  
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);

        // .add() = to add an element
        // .remove() = to remove an element it takes index
        fruits.remove(0);
        System.out.println(fruits);

        //.set() = it is used to add an element at a specific index
        fruits.set(0, "Pineapple");

        // .get() = this is used to get an element at specific index
        System.out.println(fruits.get(1));

        //.size() gives you the size of the arraylist
        System.out.println(fruits.size());

        Collections.sort(fruits); // Collections framework to sort the arraylists
        Collections.sort(list);
        // System.out.println(Collections.sort(fruits));
        System.out.println(list);

        for( String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
