# 📚 Library Management System

## Project description

A desktop application written in Java for comprehensive management of library collections and reader services. The system lets you catalog books, register users and track loans through an intuitive graphical user interface (GUI).

## Features

### Collection management
- ➕ **Adding books** - registering new items in the system
- 📊 **Detailed records** - author, title, publication year, price, status (borrowed/available)
- 📖 **Availability check** - a list of books currently available in the library

### Reader management
- 👤 **Reader registration** - adding new users (first name, last name)
- 📚 **Borrowing history** - tracking the books borrowed by each reader

### Loan operations
- 📤 **Borrowing books** - assigning a book to a reader
- 📥 **Returning books** - recording the return and updating the book's status

### Statistics and reports
- 🏆 **Reader ranking** - identifying the users with the most loans
- 📅 **Publication year analysis** - the year in which the most books in the collection were published
- ✍️ **Author statistics** - the author with the most titles in the library

## Technologies

- **Programming language:** Java
- **Interface:** GUI (Graphical User Interface)
- **Paradigm:** Object-oriented programming (OOP)

## Data structure

### Book class
```
- author: String
- title: String
- publication year: int
- price: double
- status: enum (AVAILABLE, BORROWED)
```

### Reader class
```
- first name: String
- last name: String
- borrowed books: List<Book>
```

## User interface

The application has a graphical user interface with easy navigation through a numbered menu system.

**Sample screen:** Option 5 - Displaying books available in stock

---

## Author: Katarzyna Majzel-Pośpiech

A first project in Java - an educational application demonstrating the fundamentals of object-oriented programming and desktop application development.


*Project completed as part of learning Java programming*

![library](https://user-images.githubusercontent.com/104032721/229352645-d67d8206-fa2a-432f-9a7c-f8efed01c2ab.jpg)


