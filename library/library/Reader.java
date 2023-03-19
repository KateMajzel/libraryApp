package library.library;
import java.util.Objects;

public class Reader {
    private String name;
    private String surname;

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return name.equals(reader.name) && surname.equals(reader.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}