package com.vladpr.webtech.task7;

public class Main {
    public static void sort(double[] arr) {
        int i = 1;
        while (i < arr.length-1) {
            if (arr[i] <= arr[i+1]) {
                i++;
            } else {
                double temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }

}
