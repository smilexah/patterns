package org.sdu.edu.kz;

import org.sdu.edu.kz.Interfaces.IBookCategory;
import org.sdu.edu.kz.Interfaces.ILibraryUser;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String category;

    public Book(String title, String author, String ISBN, String category) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.category = category;
    }



    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nCategory: " + category + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
