package com.vladpr.webtech.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Task3Test {
    @Test
    void functionTest() {
        List<Double> expected = Arrays.asList(0.9956, -2.2858, 0.0416, 2.9271, -0.8423, 0.5463, -7.6966, -0.2464);
        List<Double> actual = Main.findResult(-5.5, 3, 1.2);
        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), 0.0001);
        }
    }
}
