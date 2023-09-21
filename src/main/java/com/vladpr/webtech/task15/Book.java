package com.vladpr.webtech.task15;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[title='%s', author='%s', price='%d']", title, author, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book book) {
            return this.title.equals(book.title)
                    && this.author.equals(book.author)
                    && this.price == book.price
                    && this.isbn == book.isbn;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 41 * this.author.length() + 59 * this.title.length() + price * 13;
    }

    @Override
    public int compareTo(@NotNull Book o) {
        return this.isbn - o.isbn;
    }
}
