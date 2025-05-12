package INHERITANCE.SUPER;

public class Student extends Person {
    double gpa;
    Student(String first, String last, double gpa ){
        super(first,last); // calling parent
        this.gpa = gpa;

    }
    void showGpa(){
        System.out.println(this.first+" "+this.last+" got "+this.gpa+" gpa");
    }

}
