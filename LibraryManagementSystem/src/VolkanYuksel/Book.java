package VolkanYuksel;

public class Book extends LibraryItem{
    private Person author;
    private String isbn;

    public Book(String title, Person author, String isbn){
        super(title);
        this.author = author;
        this.isbn = isbn;
    }

    public Person getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    @Override
    public String toString(){
        return super.toString() + " Author : " + this.getAuthor() + " ISBN : " + this.getIsbn();
    }
}
