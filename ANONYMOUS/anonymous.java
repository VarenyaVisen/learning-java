package ANONYMOUS;

public class anonymous {
    public static void main(String[] args) {
        
        // Anonymous class : A calss that does'nt have a name, Cannot be reused
        //                   Add custom behavior without having to create a new class
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        // NOte : it is really inconvenient to create a new class just for 1 object that's why we use anonymous class

        Dog dog1 = new Dog();
        // We know scooby doo speaks english he does'nt woof
        // SO instead of creating seperate class for him and overriding the speak method for him
        // We will make or we will use anonymous class

        Dog dog2 = new Dog(){ // ANONYMOUS CLASS : No name, Cannot be reused
            @Override
            void speak(){
                System.out.println("Scooby DOO says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();

    }

}
