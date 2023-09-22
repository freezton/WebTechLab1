package com.vladpr.webtech.task5;

public class Main {

    public static int findAmount(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            return 0;
        }

        int length = 0;
        int[] extraArr = new int[arr.length];
        extraArr[0] = Integer.MIN_VALUE;
        for (int i = 1; i < extraArr.length; i++) {
            extraArr[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = binarySearch(extraArr, 0 ,arr.length-1, arr[i]);
            if (extraArr[j - 1] < arr[i] && arr[i] < extraArr[j]) {
                extraArr[j] = arr[i];
                length = Math.max(length, j);
            }
        }
        return arr.length - length;
    }

    private static int binarySearch(int[] arr, int left, int right, int curr) {
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
