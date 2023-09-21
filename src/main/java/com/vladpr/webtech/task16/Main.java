package com.vladpr.webtech.task16;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void sortByTitle(List<Book> list) {
        Comparator<Book> titleComparator = new TitleComparator();
        list.sort(titleComparator);
    }

    public static void sortByTitleAuthor(List<Book> list) {
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        list.sort(titleAuthorComparator);
    }

    public static void sortByAuthorTitle(List<Book> list) {

    }

    public static void sortByAuthorTitlePrice(List<Book> list) {

    }
}
