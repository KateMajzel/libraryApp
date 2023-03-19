package library.library;


import java.util.Objects;

public class Books {

    private String author;
    private String title;
    private Integer yearOfPublishment;
    private Double price;
    private Reader reader;

    public Books(String author, String title, Integer yearOfPublishment, Double price, Reader reader) {
        this.author = author;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
        this.price = price;
        this.reader = reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public Integer getYearOfPublishment() {
        return yearOfPublishment;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                ", price=" + price +
                ", reader=" + reader
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return author.equals(books.author) && title.equals(books.title) && yearOfPublishment.equals(books.yearOfPublishment) && price.equals(books.price) && reader.equals(books.reader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfPublishment, price, reader);
    }
}