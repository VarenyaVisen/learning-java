package ARRAY.search;

public class array_search {
    public static void main(String[] args) {
        
        int[] numbers = {1,4,5,8,3,9,7,2};
        int target = 2;
        boolean isFound = false;

        for(int i=0;i<numbers.length;i++){
            if (target == numbers[i]) {
                System.out.println("Element found at : "+i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element nnot found in the array");
        }
    }
}
