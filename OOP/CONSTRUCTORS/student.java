package CONSTRUCTORS;

public class student {
    // ISSUE : if we initialize variables in this class
    //         all the objects made by using this class will have same attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // That's why we have constructors
    // Special method within a class
    // To build one we use the name of the class
    student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    // Method
    void study(){
        System.out.println(this.name+" is studying");
    }
}
