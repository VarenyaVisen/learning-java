package METHODS.VARARGS;

public class avg_varargs {
    public static void main(String[] args) {
        
        System.out.println(average(1,2,3,4));
        System.out.println(average());
    }
    static double average(double... numbers){
        double sum = 0;
        if (numbers.length == 0) {
            return 0;
        }
        for(double num : numbers){
            sum+=num;
        }

        return sum/numbers.length;
    }
}
