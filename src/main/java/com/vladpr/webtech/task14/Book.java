package com.vladpr.webtech.task14;

import org.jetbrains.annotations.NotNull;

public class Book  {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
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
                    && this.price == book.price;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 41 * (this.author.length() + this.title.charAt(0))  + 59 * (this.title.length() + this.title.charAt(0)) + price * 13;
    }


    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }

}
