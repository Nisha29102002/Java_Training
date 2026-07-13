package com.coforge.Assignment;

import java.util.*;

public class InsertAtPoistion {
    static int[] insertAtPosition(int[] arr, int pos, int value) {
        int n = arr.length;
        int[] result = new int[n + 1];
        for (int i = 0; i < pos; i++)
            result[i] = arr[i];
        result[pos] = value;
        for (int i = pos; i < n; i++)
            result[i + 1] = arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println("After insertion: " + Arrays.toString(insertAtPosition(arr, 2, 3)));
    }
}