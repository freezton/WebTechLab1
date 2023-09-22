package com.vladpr.webtech.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    void firstFindAmountTest() {
        int expected = 5;
        int actual = Main.findAmount(new int[] {13, 12, 54, 36, 48, 11, 96, 57, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void secondFindAmountTest() {
        int expected = 1;
        int actual = Main.findAmount(new int[] {1, 2, 3, 4, 5, 6, 8, 7});
        Assertions.assertEquals(expected, actual);
    }
}
