package org.sdu.edu.kz.Interfaces;

import org.sdu.edu.kz.Book;

import java.util.List;

public interface ISearchable {
    Book searchByTitle(String title);
    List<Book> searchByAuthor(String author);
}
