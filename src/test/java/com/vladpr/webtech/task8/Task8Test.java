package com.vladpr.webtech.task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task8Test {

    @Test
    void findIndexesTest() {
        List<Integer> expected = List.of(4, 4, 1, 3);
        List<Integer> actual = Main.findIndexes(
                new double[] {1, 2, 3, 4, 5},
                new double[] {4, 7, 1, 3}
        );
        Assertions.assertEquals(expected, actual);
    }
}
