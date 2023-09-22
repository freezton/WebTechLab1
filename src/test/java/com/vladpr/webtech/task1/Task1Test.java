package com.vladpr.webtech.task1;

import com.vladpr.webtech.task1.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void findResultBothPositive() {
        Assertions.assertEquals(51.33751, Main.findResult(51.3, 3.65), 0.00001);
    }

    @Test
    void findResultPositiveAndNegative() {
        Assertions.assertEquals(-9.44943, Main.findResult(-9.61, 14.7), 0.00001);
    }

}