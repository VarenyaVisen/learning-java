package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like : ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i<=numOfFood;i++){
            System.out.print("Enter food #"+i+" : ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
        for(String food : foods){
            System.out.println(food);
        }

        sc.close();
    }
}
