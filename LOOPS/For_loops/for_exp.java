package For_loops;

import java.util.Scanner;

public class for_exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop : ");
        int max = sc.nextInt();

        for(int i = 1;i<=max;i++){
            System.out.println(i);
        }

        sc.close();
    }
}
