package ARRAY;

public class array {
    public static void main(String[] args) {
        // Array is a reference datatype
        // array[] = a collection of values of the same data type 
        //         * Think of it as a variable that can store more than 1 value *

        // if we print we print our array(fruits) we get memory address
        String[] fruits = {"apple","mango","banana","orange"};
        System.out.println(fruits[2]);

        // changing the value at specific index
        fruits[2] = "coconut";
        System.out.println(fruits[2]);

        // To get the length of an array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // to print all the elements of an array we can use for loop
        for(int i = 0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }

    }
}
