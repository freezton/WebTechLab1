package com.vladpr.webtech.task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallsAndBasketTest {

    Basket basket = new Basket(Arrays.asList(
            new Ball(0.3, Color.BLUE),
            new Ball(0.35, Color.RED),
            new Ball(0.2, Color.BLUE),
            new Ball(0.3, Color.BLUE),
            new Ball(0.1, Color.BLUE),
            new Ball(0.3, Color.RED),
            new Ball(0.25, Color.BLUE),
            new Ball(0.3, Color.GREEN),
            new Ball(0.4, Color.GREEN)
    ));

    @Test
    public void findWeight() {
        Assertions.assertEquals(2.5, Main.findWeight(basket.getList()));
    }

    @Test
    public void findBlueAmount() {
        long amount = basket.getList().stream().filter(ball -> ball.getColor().equals(Color.BLUE)).count();
        Assertions.assertEquals(5, amount);
    }
}
