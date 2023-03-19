package library.library;

import library.library.Books;
import library.library.Reader;

import java.util.List;
import java.util.Scanner;

public class Ui {

    public void selection_of_librarian() {
        System.out.println("Operation complete. Choose new: ");
        System.out.println("1. Add book");
        System.out.println("2. Add reader");
        System.out.println("3. Book rental");
        System.out.println("4. Return book");
        System.out.println("5. Books in stock");
        System.out.println("6. See who has the most books");
        System.out.println("7. Which year has the most books published?");
        System.out.println("8. Which author has written the most books?");
        System.out.println("9. End");
    }

    public void librarianAddBook(List<Books> books) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the name of the author");
        String author = myScanner.nextLine();

        System.out.println("Enter the title of the book");
        String title = myScanner.nextLine();

        System.out.println("Enter the year of publication");
        Integer yearOfPublishment = myScanner.nextInt();

        System.out.println("Tell the price zł");
        double price = myScanner.nextDouble();

        Books book = new Books(author, title, yearOfPublishment, price, null);
        books.add(book);
    }

    public void librarianAddReader(List<Reader> readers) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the name of the reader");
        String name = myScanner.nextLine();

        System.out.println("Enter the name of the reader");
        String surname = myScanner.nextLine();

        Reader reader = new Reader(name, surname);
        readers.add(reader);
    }

    public int getBookIndex(List<Books> books) {
        System.out.println("Book list");
        System.out.println(books);
        System.out.println(" ");
        System.out.println("Enter the book number");
        Scanner myScanner = new Scanner(System.in);
        int userBookIndex = myScanner.nextInt();
        return userBookIndex;
    }

    public int getUserIndex(List<Reader> readers) {
        System.out.println("Readers list");
        System.out.println(readers);
        System.out.println(" ");
        System.out.println("Enter the reader's number");
        Scanner myScanner = new Scanner(System.in);
        int userIndex = myScanner.nextInt();
        return userIndex;
    }

    public int returnBook(List<Books> books) {
        System.out.println("Enter the number of the returned book");
        Scanner myScanner = new Scanner(System.in);
        int userReturnIndexBook = myScanner.nextInt();
        return userReturnIndexBook;
    }

}
