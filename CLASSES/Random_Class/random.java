package Random_Class;

import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        // origin : inclusive, bound : exclusive 
        int number;
        number = rand.nextInt(1,7);
        System.out.println(number);

        boolean isHeads;
        isHeads = rand.nextBoolean();
        if (isHeads) {
            System.out.println("It's HEADS");
        }
        else{
            System.out.println("It's TAILS");
        }
    }
}
