package com.vladpr.webtech.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Double> findResult(double a, double b, double h) {
        List<Double> resultList = new ArrayList<>();
        do {
            double result = Math.tan(a);
            resultList.add(result);
            System.out.println(a + " " + result);
            a += h;
        } while (a < b);
        return resultList;
    }

}
