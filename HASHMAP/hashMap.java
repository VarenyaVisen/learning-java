package HASHMAP;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but values can be duplicate
        //           Does not maintain any order, but memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut",1.00);

        map.remove("apple");

        System.out.println(map);

        // To get the value associated with the key we use get() method
        System.out.println(map.get("apple"));
        System.out.println(map.get("coconut"));

        // To check if a value exist or not
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsKey("mango"));

        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.00));
 
        // to get the size of a map
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key+ " : $"+map.get(key));
        }

    }
}
