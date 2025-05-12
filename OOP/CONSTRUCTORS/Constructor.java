package CONSTRUCTORS;


public class Constructor {
    public static void main(String[] args) {
        // Constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        // A constructor is automatically called when an object is created

        student student1 = new student("Varenya", 21, 3.5);
        student student2 = new student("Janvi", 20, 2.8);
        student student3 = new student("Pragya", 19, 3.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student1.isEnrolled);
        
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        // method calling by objects
        student1.study();
        student2.study();
        student3.study();

    }
}
