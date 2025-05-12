package ARRAY.search;

import java.util.Scanner;

public class fruit_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First we'll make array from user
        System.out.println("*****FRUIT BASKET*****");

        int size;
        System.out.print("Enter the size of the basket : ");
        size = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[size];

        for(int i = 0;i<fruits.length;i++){
            System.out.print("Enter the fruit name to put in basket : ");
            fruits[i] = sc.nextLine().toLowerCase();
        }
        System.out.println("## YOUR BASKET ##");
        for(String fruit : fruits){
            System.out.print(fruit+" ");
        }
        System.out.println();

        // Now we will check whether a fruit is present in the basket or not
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for : ");
        target = sc.nextLine().toLowerCase();
        
        for(int i = 0;i<fruits.length;i++){
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index : "+i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Sorry the fruit is not present in the basket");
        }

        sc.close();
    }
}
