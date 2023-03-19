package library.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Ui ui = new Ui();

        Books Enchanted_World = new Books("Tomasz Nowy", "Enchanted World", 1999, 23.00, null);
        Books Trains = new Books("Michał Znany", "Trains", 1999, 55.00, null);
        Books Hedgehog_Nikos = new Books("Katarzyna Majzel", "Hedgehog Nikos", 2021, 10.40, null);
        Books Book_of_dreams = new Books("Katarzyna Majzel", "Book of Dreams", 2020, 35.00, null);
        library.addBooks(Enchanted_World);
        library.addBooks(Trains);
        library.addBooks(Hedgehog_Nikos);
        library.addBooks(Book_of_dreams);

        Reader Jadwiga_Pos = new Reader("Jadwiga", "Pospiech");
        Reader Zenon_Wesoly = new Reader("Zenon", "Wesoly");
        Reader Filemon_Majzel = new Reader("Filemon", "Majzel");
        library.addReader(Jadwiga_Pos);
        library.addReader(Zenon_Wesoly);
        library.addReader(Filemon_Majzel);

        System.out.println("Welcome to the library application - LIB. " +
                "Enter the number of the action you want to do.");
        System.out.println("1. Add book");
        System.out.println("2. Add reader");
        System.out.println("3. Book rental");
        System.out.println("4. Return book");
        System.out.println("5. Books in stock");
        System.out.println("6. See who has the most books");
        System.out.println("7. Which year has the most books published?");
        System.out.println("8. Which author has written the most books?");
        System.out.println("9. End");

        library.menuChoice();
    }
}

