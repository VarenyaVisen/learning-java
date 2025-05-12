package CONSTRUCTORS.OVERLOAD;

public class const_overload {
    public static void main(String[] args) {
        
        // Overloaded constructors = Allow a class to have multiple constructors 
        //                           with different parameter lists.
        //                           enables object to be initialized in variouse ways

        user user4 = new user();
        user user1 = new user("SENTINEL");
        user user2 = new user("SENTINEL","varenyavisen@gmail.com");
        user user3 = new user("SENTINEL","varenyavisen@gmail.com",21);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
