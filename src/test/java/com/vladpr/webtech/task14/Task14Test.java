package com.vladpr.webtech.task14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task14Test {

    @Test
    void cloneTest() {
        Book book = new Book("title", "author", 17);
        Assertions.assertEquals(book, book.clone());
    }
}
