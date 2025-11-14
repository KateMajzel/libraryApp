# 📚 System Zarządzania Biblioteką

## Opis projektu

Aplikacja desktopowa napisana w Javie do kompleksowego zarządzania zbiorami bibliotecznymi oraz obsługi czytelników. System umożliwia ewidencję książek, rejestrację użytkowników oraz monitoring wypożyczeń z intuicyjnym interfejsem graficznym (GUI).

## Funkcjonalności

### Zarządzanie księgozbiorem
- ➕ **Dodawanie książek** - rejestracja nowych pozycji w systemie
- 📊 **Ewidencja szczegółów** - autor, tytuł, rok wydania, cena, status (wypożyczona/dostępna)
- 📖 **Sprawdzanie dostępności** - lista książek aktualnie dostępnych w bibliotece

### Zarządzanie czytelnikami
- 👤 **Rejestracja czytelników** - dodawanie nowych użytkowników (imię, nazwisko)
- 📚 **Historia wypożyczeń** - śledzenie książek wypożyczonych przez każdego czytelnika

### Operacje wypożyczeń
- 📤 **Wypożyczanie książek** - przypisanie książki do czytelnika
- 📥 **Zwrot książek** - odnotowanie zwrotu i aktualizacja statusu

### Statystyki i raporty
- 🏆 **Ranking czytelników** - identyfikacja użytkowników z największą liczbą wypożyczeń
- 📅 **Analiza roczników** - rok, w którym opublikowano najwięcej książek w zbiorach
- ✍️ **Statystyki autorów** - autor z największą liczbą pozycji w bibliotece

## Technologie

- **Język programowania:** Java
- **Interface:** GUI (Graphical User Interface)
- **Struktura:** Programowanie obiektowe (OOP)

## Struktura danych

### Klasa Book
```
- autor: String
- tytuł: String
- rok wydania: int
- cena: double
- status: enum (DOSTĘPNA, WYPOŻYCZONA)
```

### Klasa Reader
```
- imię: String
- nazwisko: String
- wypożyczone książki: List<Book>
```

## Interfejs użytkownika

Aplikacja wyposażona w graficzny interfejs użytkownika umożliwiający łatwą nawigację poprzez system menu numerycznego.

**Przykładowy ekran:** Opcja 5 - Wyświetlanie książek dostępnych w magazynie

---

## Autor: Katarzyna Majzel-Pośpiech

Pierwszy projekt w języku Java - aplikacja edukacyjna demonstrująca podstawy programowania obiektowego i tworzenia aplikacji desktopowych.


*Projekt realizowany w ramach nauki programowania w Java*

![library](https://user-images.githubusercontent.com/104032721/229352645-d67d8206-fa2a-432f-9a7c-f8efed01c2ab.jpg)
