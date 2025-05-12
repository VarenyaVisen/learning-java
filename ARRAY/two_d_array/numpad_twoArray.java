package ARRAY.two_d_array;

public class numpad_twoArray {
    public static void main(String[] args) {
        
        char[][] telephone = {{'1','2','3'}, 
                              {'4','5','6'},
                              {'7','8','9'}, 
                              {'*','0','#'}};
        for(char[] rows : telephone){
            for(char number : rows){
                System.out.print(number+" ");
            }
            System.out.println();
        }                    

    }
}
