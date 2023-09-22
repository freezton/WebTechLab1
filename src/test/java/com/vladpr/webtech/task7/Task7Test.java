package com.vladpr.webtech.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    void sortTest() {
        double[] arr = new double[] {5.5, -4.8, 0, 11, -6.3, 14, 2.5};
        double[] expected = new double[] {-6.3, -4.8, 0, 2.5, 5.5, 11, 14};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            Assertions.assertEquals(arr[i], expected[i], 0.01);
        }
    }
}
