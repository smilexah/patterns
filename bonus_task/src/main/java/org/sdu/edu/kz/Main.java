package org.sdu.edu.kz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.sdu.edu.kz.Interfaces.IBookCategory;
import org.sdu.edu.kz.Interfaces.ILibraryUser;

// public class Main {
//     public static void main(String[] args) {
//         Library library = new Library();

//         Book book1 = new Book("Book Title 1", "Author 1", "ISBN123", "Fiction");
//         Book book2 = new Book("Book Title 2", "Author 2", "ISBN456", "Science Fiction");

//         library.addBook(book1);
//         library.addBook(book2);

//         Student student = new Student();
//         Faculty faculty = new Faculty();

//         library.registerUser(student);
//         library.registerUser(faculty);

//         library.lendBook(book1, student);
//         library.receiveReturnedBook(book1, student);

//         library.displayCatalog();
//     }
// }


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  

        List<String> studentList = new ArrayList<>();
        List<String> nameAndSurnameList = new ArrayList<>()
        List<Integer> scoresList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            nameAndSurnameList.add(sc.next() + " " + sc.next());

            scoresList.add(sc.nextInt());

            studentList.add(nameAndSurnameList.get(i) + " " + scoresList.get(i));
        }

        Collections.sort(studentList);

        for(int i = 0; i < n; i++) {
            System.out.println(studentList.get(i));
        }
    }
}