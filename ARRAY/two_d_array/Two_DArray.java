package ARRAY.two_d_array;

public class Two_DArray {
    public static void main(String[] args) {
        // 2D Array = An array where each element is an array
        //            useful for storing a matrix of date

        String[][] groceries = {{"Apple","Orange","Mango","Banana"}
                                ,{"Potato","Onion","Potato"},
                                {"Chciken","pork","beef","fish"}};// each data type in this is String[] array

        // To change or access the element from the array we need 2 indices
        groceries[0][0] = "Pineapple"; //[row][column]

        // we get memory addresses because arrays are reference datatype
        for(String[] foods:groceries){
            System.out.println(foods);
        }
        
        // we need nested loop to print the array
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }
    }
}
