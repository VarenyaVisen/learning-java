package For_loops;

public class for_loop {
    public static void main(String[] args) {
        
        // for loop = execute some code a CERTAIN amount of times
        // for(initialization ; condition ; update){Body = block of code}

        // Increment 1-10
        for(int i = 1; i <= 10; i++){
            System.out.println(i+". Pizza");
        }
        // Decrement 10-1
        for(int i = 10; i > 0; i--){
            System.out.println(i+". Burger");
        }

        // Incrementing the i with any number
        for(int i = 1;i<=10;i+=2){
            System.out.println(i);
        }
        // Decrementing the i with any number 
        for(int i = 10;i>0;i-=2){
            System.out.println(i);
        }
    }
}
