package model;

import java.util.Objects;

public class Book {
    private long id;
    private String title;
    private long publish_date;
    private String genre;
    private int amount;
    private int sold;
    private long author_id;

    public Book() {
    }

    public Book(String title, long publish_date, String genre, int amount, int sold, long author_id) {
        this.title = title;
        this.publish_date = publish_date;
        this.genre = genre;
        this.amount = amount;
        this.sold = sold;
        this.author_id = author_id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(long publish_date) {
        this.publish_date = publish_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                publish_date == book.publish_date &&
                amount == book.amount &&
                sold == book.sold &&
                author_id == book.author_id &&
                Objects.equals(title, book.title) &&
                Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, publish_date, genre, amount, sold, author_id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publish_date=" + publish_date +
                ", genre='" + genre + '\'' +
                ", amount=" + amount +
                ", sold=" + sold +
                ", author_id=" + author_id +
                '}';
    }
}
