package com.vladpr.webtech.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {

    @Test
    void getMatrixTest() {
        double[] arr = new double[] {1, 34, 16, 8};
        double[][] expected = new double[][] {
                {1, 34, 16, 8},
                {34, 16, 8, 1},
                {16, 8, 1, 34},
                {8, 1, 34, 16}
        };
        double[][] actual = Main.getMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Assertions.assertEquals(expected[i][j], actual[i][j], 0.01);
            }
        }
    }
}
