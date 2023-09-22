package com.vladpr.webtech.task9;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static double findWeight(List<Ball> list) {
        double weight = 0;
        for (Ball ball: list) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public static int findBlueBallAmount(List<Ball> list) {
        int amount = 0;
        for (Ball ball: list) {
            if (ball.getColor().equals(Color.BLUE)) {
                amount++;
            }
        }
        return amount;
    }

    public static void main(String[] args) {
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
        System.out.println("Weight: " + findWeight(basket.getList()));
        System.out.println("Blue ball count: " + findBlueBallAmount(basket.getList()));
    }
}
