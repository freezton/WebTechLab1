package com.vladpr.webtech.task2;

public class Main {
    public static boolean isInRegion(int x, int y) {
        return ((x >= -4 && y >= 0 && x <= 4 && y <=5) || (x >= -6 && y >= -3 && x <= 6 && y <= 0));
    }
}
