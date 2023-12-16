package org.sdu.edu.kz;

import org.sdu.edu.kz.Interfaces.IBorrowable;
import org.sdu.edu.kz.Interfaces.ILibraryUser;
import org.sdu.edu.kz.Interfaces.ISearchable;

import java.util.ArrayList;
import java.util.List;

//public class Library implements ISearchable, IBorrowable {
//    private List<Book> books;
//    private List<ILibraryUser> users;
//
//    public Library() {
//        books = new ArrayList<>();
//        users = new ArrayList<>();
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(String ISBN) {
//        for (Book book : books) {
//            if (book.getISBN().equals(ISBN)) {
//                books.remove(book);
//                break;
//            }
//        }
//    }
//
//    @Override
//    public Book searchByTitle(String title) {
//        for (Book book : books) {
//            if (book.getTitle().equalsIgnoreCase(title)) {
//                return book;
//            }
//        }
//
//        return null;
//    }
//    @Override
//    public void borrowBook(Book book) {
//        if (book.isAvailable()) {
//            book.setBorrower((ILibraryUser) this);
//            book.setAvailable(false); // Mark the book as not available
//            System.out.println("Successfully borrowed the book: " + book.getTitle());
//        } else {
//            System.out.println("Sorry, the book " + book.getTitle() + " is not available for borrowing.");
//        }
//    }
//    @Override
//    public List<Book> searchByAuthor(String author) {
//        List<Book> matchingBooks = new ArrayList<>();
//
//        for (Book book : books) {
//            if (book.getAuthor().equalsIgnoreCase(author)) {
//                matchingBooks.add(book);
//            }
//        }
//
//        return matchingBooks;
//    }
//
//    @Override
//    public void returnBook(Book book) {
//        if (!book.isAvailable() && book.getBorrower() == this) {
//            book.setAvailable(true); // Mark the book as available
//            book.setBorrower(null); // Clear the borrower information
//            System.out.println("Successfully returned the book: " + book.getTitle());
//        } else {
//            System.out.println("Sorry, you cannot return the book " + book.getTitle() + " as it was not borrowed by you.");
//        }
//    }
//
//    public void registerUser(ILibraryUser user) {
//        users.add(user);
//    }
//
//    public void lendBook(Book book, ILibraryUser user) {
//        if (books.contains(book) && users.contains(user)) {
//            user.borrowBook(book);
//        }
//    }
//
//    public void receiveReturnedBook(Book book, ILibraryUser user) {
//        if (books.contains(book) && users.contains(user)) {
//            user.returnBook(book);
//        }
//    }
//}

public class Library {
    private List<Book> books;
    private List<ILibraryUser> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
    }

    public void registerUser(ILibraryUser user) {
        users.add(user);
    }

    public void lendBook(Book book, ILibraryUser user) {
        if (books.contains(book) && users.contains(user)) {
            user.borrowBook(book);
        }
    }

    public void receiveReturnedBook(Book book, ILibraryUser user) {
        if (books.contains(book) && users.contains(user)) {
            user.returnBook(book);
        }
    }

    public void displayCatalog() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}