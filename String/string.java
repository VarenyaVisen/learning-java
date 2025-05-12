package String;

public class string {
    public static void main(String[] args) {
        // Some useful String Methods
        System.out.println("String Methods");

        String name = "   Varenya   ";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("V");
        int lastIndex = name.lastIndexOf("a");



        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.trim();
        System.out.println(name);
        name = name.replace("a", "o");
        System.out.println(name);

        System.out.println(name.isEmpty());
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello "+name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name contains spaces");
        }
        else{
            System.out.println("Your name does'nt contain any spaces");
        }

        // equal does'nt care about case sensitive 
        if (name.equals("Password")) {
            System.out.println("Your name can't be password ");
        }
        else{
            System.out.println("Hello "+name);
        }
        // for case sensitive we use equalsIgnoreCase()

    }
}
