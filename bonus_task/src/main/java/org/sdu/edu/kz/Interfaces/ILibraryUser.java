package org.sdu.edu.kz.Interfaces;

import org.sdu.edu.kz.Book;

public interface ILibraryUser {
    void borrowBook(Book book);
    void returnBook(Book book);
}
