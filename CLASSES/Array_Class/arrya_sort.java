package Array_Class;

import java.util.Arrays;

public class arrya_sort {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","banana","orange"};

        Arrays.sort(fruits);/// arranged alphabetically / if numbers it would be ascending order
        Arrays.fill(fruits, "pineapple"); // it fills the array with the value given
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
