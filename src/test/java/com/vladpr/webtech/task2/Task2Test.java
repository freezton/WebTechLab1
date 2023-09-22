package com.vladpr.webtech.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    void inRegionTest() {
        Assertions.assertTrue(Main.isInRegion(-2, 3));
    }

    @Test
    void outOfRegionTest() {
        Assertions.assertFalse(Main.isInRegion(5, 1));
    }

    @Test
    void onBorderTest() {
        Assertions.assertTrue(Main.isInRegion(1, 5));
    }
}
