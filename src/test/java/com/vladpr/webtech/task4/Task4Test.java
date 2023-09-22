package com.vladpr.webtech.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Task4Test {

    @Test
    void findPrimeNumbersTest() {
        List<Integer> expected = List.of(1, 4, 5, 7, 9);
        List<Integer> actual = Main.findPrimeNumbers(new int[] {1, 2, 4, 6, 23, 7, 12, 13, 44, 59, 18});
        Assertions.assertEquals(expected, actual);
    }
}
