package com.vladpr.webtech.task1;

public final class Main {

    public static double findResult(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }

}
