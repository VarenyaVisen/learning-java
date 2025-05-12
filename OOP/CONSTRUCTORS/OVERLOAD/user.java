package CONSTRUCTORS.OVERLOAD;

public class user {

    String username;
    String email;
    int age;

//  You can have constructors with same name and different parameters 

    user(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    user(String username){
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }

    user(String username,String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    user(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
