package Break_continue;

public class example {
    public static void main(String[] args) {
        
        // Break =  break out of the loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        // break
        for(int i = 0 ;i<=10;i++){
            if (i == 5) {
                System.out.print(i+" ");
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        // continue : it skips the  5
        for(int i = 0;i<=10;i++){
            if (i == 5) {
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
