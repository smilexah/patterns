package org.sdu.edu.kz;

import org.sdu.edu.kz.Interfaces.ILibraryUser;

public class Faculty implements ILibraryUser {
    // Faculty-specific properties and methods

    @Override
    public void borrowBook(Book book) {
        // Implement borrowing logic for faculty
    }

    @Override
    public void returnBook(Book book) {
        // Implement returning logic for faculty
    }
}
