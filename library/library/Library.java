package library.library;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    public List<Books> books = new ArrayList<>();
    public List<Reader> readers = new ArrayList<>();

    Ui ui = new Ui();

    public void addBooks(Books book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addNewBook() {
        ui.librarianAddBook(books);
    }

    public void addNewReader() {
        ui.librarianAddReader(readers);
    }

    public void borrowingBook() {
        int userIndex = ui.getUserIndex(readers);
        int bookIndex = ui.getBookIndex(books);
        books.get(bookIndex).setReader(readers.get(userIndex));
    }

    public void borrowedBooks() {
        showAllbooks();
        System.out.println("");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getReader() != null) {
                System.out.println("Book index: " + i + " " + books.get(i).toString());
            }
            System.out.println("");
        }
    }

    public void returnBook() {
        showAllbooks();
        System.out.println("");
        int userReturnIndexBook = ui.returnBook(books);
        books.get(userReturnIndexBook).setReader(null);
    }

    public void booksInStock() {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getReader() == null) {
                System.out.println("Books in stock: " + i + " " + books.get(i).toString());
                System.out.println("");
            }
        }
    }

    public void countFrequencies() {
        Map<Reader, Integer> readersNumberMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            Integer j = readersNumberMap.get(books.get(i).getReader());
            readersNumberMap.put(books.get(i).getReader(), (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<Reader, Integer> eachReader : readersNumberMap.entrySet()) {
            if (eachReader.getKey() != null) {
                System.out.println(eachReader.getKey() + "has: " + eachReader.getValue() + " books");
            } else {
                System.out.println("Nobody borrows books");

            }
            System.out.println("");
        }
    }

    public void countYearOfPublished() {
        Map<Integer, Integer> publishedNumberMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            Integer j = publishedNumberMap.get(books.get(i).getYearOfPublishment());
            publishedNumberMap.put(books.get(i).getYearOfPublishment(), (j == null) ? 1 : j + 1);
        }

        int max = Collections.max(publishedNumberMap.values());

        System.out.println("Most books have been published in " + publishedNumberMap.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));
        System.out.println("");
    }

    public void countAutorOfMostPublished() {
        Map<String, Integer> autorNumberMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            Integer j = autorNumberMap.get(books.get(i).getAuthor());
            autorNumberMap.put(books.get(i).getAuthor(), (j == null) ? 1 : j + 1);
        }

        int max = Collections.max(autorNumberMap.values());

        System.out.println("Most books are authored by " + autorNumberMap.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));
        System.out.println("");
    }

    public void showAllbooks() {
        for (Books book : books) {
            System.out.println("Book index: " + books.indexOf(book) +
                    " " + book.toString());
        }
    }

    public void showAllreaders() {
        for (Reader reader : readers) {
            System.out.println("Reader index: " + readers.indexOf(reader) + " " + reader.toString());
        }
    }

    public void menuChoice() {
        try {
            Scanner myScanner = new Scanner(System.in);
            int librarianChoice = myScanner.nextInt();
            if (librarianChoice > 9 || librarianChoice == 0 || librarianChoice == -1) {
                System.out.println("Choose again. Enter a value from 1 to 9");

            }
            do {
                switch (librarianChoice) {
                    case 1:
                        addNewBook();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 2:
                        addNewReader();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 3:
                        borrowingBook();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 4:
                        returnBook();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 5:
                        booksInStock();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 6:
                        countFrequencies();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 7:
                        countYearOfPublished();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 8:
                        countAutorOfMostPublished();
                        ui.selection_of_librarian();
                        menuChoice();
                        break;
                    case 9:
                        break;
                }
            } while (librarianChoice == 9);

        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Invalid value selected.");
            System.out.println("Choose again. Enter a value from 1 to 9");
        }
    }
}

