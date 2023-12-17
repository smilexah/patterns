package org.sdu.edu.kz.Interfaces;

import org.sdu.edu.kz.Book;

public interface IBorrowable {
    public void borrowBook(Book book);
    public void returnBook (Book book);
}
