package com.coforge.Assignment;

import java.util.*;


public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int t = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        selectionSort(arr);
        System.out.println("Selection sorted: " + Arrays.toString(arr));
    }
}