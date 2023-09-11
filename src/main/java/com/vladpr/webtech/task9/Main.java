package com.vladpr.webtech.task9;

import java.util.List;

public class Main {
    public static double findWeight(List<Ball> list) {
        double weight = 0;
        for (Ball ball: list) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public static double findBlueBallAmount(List<Ball> list) {
        int amount = 0;
        for (Ball ball: list) {
            if (ball.getColor().equals(Color.BLUE)) {
                amount++;
            }
        }
        return amount;
    }
}
