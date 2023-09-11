package com.vladpr.webtech.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> list;

    public Basket() {
        this.list = new ArrayList<>();
    }

    public Basket(List<Ball> list) {
        this.list = list;
    }

    public void addBall(Ball ball) {
        this.list.add(ball);
    }

    public List<Ball> getList() {
        return list;
    }
}
