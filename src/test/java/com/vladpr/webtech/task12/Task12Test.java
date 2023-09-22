package com.vladpr.webtech.task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task12Test {

    @Test
    void booksAreEqualTest() {
        Book firstBook = new Book("title1", "author1", 15);
        Book secondBook = new Book("title1", "author1", 15);
        Assertions.assertEquals(firstBook, secondBook);
        Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void booksAreNotEqualTest() {
        Book firstBook = new Book("title1", "author1", 15);
        Book secondBook = new Book("title2", "author1", 21);
        Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void toStringTest() {
        Book book = new Book("title1", "author1", 15);
        Assertions.assertEquals("Book=[title='title1', author='author1', price='15']", book.toString());
    }
}
