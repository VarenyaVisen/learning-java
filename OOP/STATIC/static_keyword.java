package STATIC;

public class static_keyword {
    public static void main(String[] args) {
        // Static = Makes a variable or method belong to the class 
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources
        friend friend1 = new friend("Yoru");
        friend friend2 = new friend("Reyna");
        friend friend3 = new friend("Tejo");

        // the output here will be 1 because the numOfFriend is not static not available for the class

        // Note : when calling a static method or variable we use the class name itself
        // className.staticVariable
        System.out.println("way of calling static method or variable is by class name : "+friend.numOfFriend);
        // System.out.println(friend1.numOfFriend);
        // System.out.println(friend2.numOfFriend);
        // System.out.println(friend3.numOfFriend);
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        // This is a static method wo we will call it by using the name of the class
        System.out.println("Method called using the name of the class");
        friend.showFriends();
        // This method is not static so we need to use the object name to call the function
        System.out.println("Method called by using the name of the object");
        friend1.showFriendss();
        friend2.showFriendss();
        friend3.showFriendss();

    }
}
