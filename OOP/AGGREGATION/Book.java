package AGGREGATION;

public class Book {
    private String title;
    private int pages;

    Book(String title,int pages){
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    String getInfo(){
        return this.title + " ("+this.pages+" pages)";
    }

}
