package String;

public class sub_string {
    public static void main(String[] args) {
        
        // .substring() = A method used to extract a portion of a string 
        // String.substring(start, end) indices the last index is exclusive

        String email = "Bro123@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(7);
        System.out.println("Your username is : "+username);
        System.out.println("Your domain name is : "+domain);

    }
}
