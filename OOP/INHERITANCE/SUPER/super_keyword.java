package INHERITANCE.SUPER;

public class super_keyword {
    public static void main(String[] args) {
        // super = Refers to the parent class(subclass(child) <- superclass(parent))
        //         used in constructors and method overriding 
        //         calls the parent constructors to initialize attributes

        Person person = new Person("Harry", "Potter");
        person.showName();

        Student student = new Student("Varenya", "Visen", 3.7);
        System.out.println(student.first);
        System.out.println(student.last);
        System.out.println(student.gpa);
        student.showName();
        student.showGpa();

        Employee employee = new Employee("Rico", "Robin", 1000000);
        employee.showSalary();
        
    }
}
