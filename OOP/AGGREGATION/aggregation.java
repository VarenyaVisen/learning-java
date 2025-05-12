package AGGREGATION;

public class aggregation {
    public static void main(String[] args) {
        // In our example Library has-a Book (relationship) if we delete Library class the books will exist independently
        // Aggregation : Represents a "has-a" relationship between objects.
        // One object contains another object as part of it's structure, 
        // but the contained objects can exist independently
        // Aggregation: "has-a" relationship where parts can exist independently

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book [] books = {book1,book2,book3};

        // System.out.println(book1.getInfo());

        // Enhanced for loop
        for(Book book : books){
            System.out.println(book.getInfo());
        }

        // Aggregation
        // This is agregation out library object has book object
        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
        
    }
}
