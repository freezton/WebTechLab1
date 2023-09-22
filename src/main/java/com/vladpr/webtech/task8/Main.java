package com.vladpr.webtech.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> findIndexes(double[] firstArray, double[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for (double v : secondArray) {
            list.add(binarySearch(firstArray, 0, firstArray.length - 1, v));
        }
        return list;
    }

    private static int binarySearch(double[] arr, int left, int right, double curr) {
        int mid = -1;
        if (curr < arr[left])
            return left;
        if (curr > arr[right])
            return right;

        while (left <= right) {
            mid = (left + right) / 2;
            if (curr >= arr[mid] && curr < arr[mid+1])
                return mid + 1;
            if (curr < arr[mid])
                right = mid - 1;
            if (curr > arr[mid])
                left = mid + 1;
        }
        return mid;
    }
}
