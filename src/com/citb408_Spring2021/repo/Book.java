package com.citb408_Spring2021.repo;

public class Book extends Document {
    private Author author;
    private String isbn;

    public Book() {

    }

    public Book(double size, String format, String title, Author author, String isbn) {
        super(size, format, title);
        this.author = author;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString()+ "Book{" +
                "author=" + author +
                ", isbn='" + isbn + '\'' +
                "} " ;
    }
}
