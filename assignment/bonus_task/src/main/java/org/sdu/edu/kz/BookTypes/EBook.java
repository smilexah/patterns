package org.sdu.edu.kz.BookTypes;

import org.sdu.edu.kz.Book;
import org.sdu.edu.kz.Interfaces.*;

public class EBook extends Book {
    private int size;

    public EBook(String title, String author, String ISBN, boolean availability, int size, IBookCategory category, ILibraryUser borrower) {
        super(title, author, ISBN, availability, category, borrower);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
