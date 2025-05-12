package WRAPPER;

public class parse {
    public static void main(String[] args) {
        
        // Parsing : String to primitive data-type
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0); // Characters don't have parsing method , So we use the charAt() method of string
        boolean d = Boolean.parseBoolean("tr");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    
}
