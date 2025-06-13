package Praktikum14;

public class Book {
    private String isbn;
    private String title;

    public Book(){

    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN:" + this.isbn + "Title:" + this.title;
    }
    
}
