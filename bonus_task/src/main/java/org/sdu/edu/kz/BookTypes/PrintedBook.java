package org.sdu.edu.kz.BookTypes;

import org.sdu.edu.kz.Book;
import org.sdu.edu.kz.Interfaces.*;

public class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook(String title, String author, String ISBN, boolean availability, int numberOfPages, IBookCategory category, ILibraryUser borrower) {
        super(title, author, ISBN, availability, category, borrower);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
