package OVERRIDE;

public class fish extends animal {

    // Here we have overriden the move method of animal class 

    // good practice to add @override
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }

}
