package ru.skypro;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String title;
    private int publisherYear;

    public Book(Author author, String name, int publisherYear) {
        this.author = author;
        this.title = name;
        this.publisherYear = publisherYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString () {
        return " Book{" + "author=" + author + ", title= '" + title + '\'' + ", publisherYear=" + publisherYear + '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode () {
        return Objects.hash(author, title, publisherYear);
    }
}
