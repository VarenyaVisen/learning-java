package INTERFACE;

// Fish is both prey and predator 
// Now we will see how interface can let us inherit multiple classes at one time
public class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting the other fish");
    }
}
