package com.vladpr.webtech.task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task13Test {
    @Test
    void booksAreEqualTest() {
        ProgrammerBook firstBook = new ProgrammerBook("title1", "author1", 15, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title1", "author1", 15, "English", 2);
        Assertions.assertEquals(firstBook, secondBook);
        Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void booksAreNotEqualTest() {
        ProgrammerBook firstBook = new ProgrammerBook("title1", "author1", 15, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title2", "author1", 21, "Russian", 1);
        Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void toStringTest() {
        ProgrammerBook book = new ProgrammerBook("title1", "author1", 15, "English", 2);
        Assertions.assertEquals("ProgrammerBook=[title='title1', author='author1', price='15', language='English', level='2']", book.toString());
    }
}
