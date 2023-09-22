package com.vladpr.webtech.task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task16Test {

    @Test
    void sortByTitleTest() {
        List<Book> expected = List.of(
                new Book("title1", "author3", 15),
                new Book("title2", "author2", 15),
                new Book("title3", "author1", 15)
        );
        List<Book> actual = new ArrayList<>(List.of(
                new Book("title3", "author1", 15),
                new Book("title1", "author3", 15),
                new Book("title2", "author2", 15)
        ));
        actual.sort(new TitleComparator());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortByTitleAuthorTest() {
        List<Book> expected = List.of(
                new Book("title1", "author1", 15),
                new Book("title1", "author2", 15),
                new Book("title3", "author1", 15)
        );
        List<Book> actual = new ArrayList<>(List.of(
                new Book("title3", "author1", 15),
                new Book("title1", "author2", 15),
                new Book("title1", "author1", 15)
        ));
        actual.sort(new TitleComparator().thenComparing(new AuthorComparator()));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortByAuthorTitleTest() {
        List<Book> expected = List.of(
                new Book("title1", "author1", 15),
                new Book("title3", "author1", 15),
                new Book("title1", "author2", 15)
        );
        List<Book> actual = new ArrayList<>(List.of(
                new Book("title3", "author1", 15),
                new Book("title1", "author2", 15),
                new Book("title1", "author1", 15)
        ));
        actual.sort(new AuthorComparator().thenComparing(new TitleComparator()));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortByAuthorTitlePriceTest() {
        List<Book> expected = List.of(
                new Book("title1", "author1", 10),
                new Book("title3", "author1", 11),
                new Book("title1", "author2", 13),
                new Book("title1", "author2", 14)
        );
        List<Book> actual = new ArrayList<>(List.of(
                new Book("title3", "author1", 11),
                new Book("title1", "author2", 13),
                new Book("title1", "author1", 10),
                new Book("title1", "author2", 14)
        ));
        actual.sort(new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator())));
        Assertions.assertEquals(expected, actual);
    }
}
