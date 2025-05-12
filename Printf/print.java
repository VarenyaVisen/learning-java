package Printf;

public class print {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        // for string we use s
        System.out.printf("Hello %s\n",name);
        // for char we use c
        System.out.printf("Your name starts with %c\n",firstLetter);
        // For integers we use d
        System.out.printf("You are %d years old\n",age);
        // For double we use f
        System.out.printf("Your height is %.1f inches\n",height);
        // for boolean we use b
        System.out.printf("Employed : %b\n",isEmployed);

        // Now we are trying multiple variables using printf
        System.out.printf("%s is %d years old", name , age);

    }
}
