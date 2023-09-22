package com.vladpr.webtech.task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task15Test {

    @Test
    void comparableTest() {
        List<Book> expected = List.of(
                new Book("title1", "author1", 16, 1),
                new Book("title1", "author1", 16, 4),
                new Book("title1", "author1", 16, 6),
                new Book("title1", "author1", 16, 18)
        );
        List<Book> actual = new ArrayList<>(List.of(
                new Book("title1", "author1", 16, 1),
                new Book("title1", "author1", 16, 18),
                new Book("title1", "author1", 16, 6),
                new Book("title1", "author1", 16, 4)
        ));
        Collections.sort(actual);
        Assertions.assertEquals(expected, actual);
    }
}
