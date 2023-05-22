package Lesson10;

import java.util.Objects;

public class Book extends Libryri {
    private String autor;


    public Book() {
    }

    public Book(String name, int year, String izdatelstvo, int countPages, String autor) {
        super(name, year, izdatelstvo, countPages);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", izdatelstvo='" + getIzdatelstvo() + '\'' +
                ", countPages=" + getCountPages() +
                "autor='" + autor + '\'' +
                '}';
    }
}

