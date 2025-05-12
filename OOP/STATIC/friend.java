package STATIC;

public class friend {

    static int numOfFriend;
    String name;

    friend(String name){
        this.name = name;
        numOfFriend++;
    }

    static void showFriends(){
        // For static variables we don't need (this) keyword
        System.out.println("You have "+numOfFriend+" friends.");
    }

    void showFriendss(){
        System.out.println("you have "+numOfFriend);
    }
}
