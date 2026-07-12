package com.coforge.Assignment;

import java.util.*;

public class MaxOfArray {
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max)
                max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 7, 2, 15, 3, 8};
        System.out.println("Max: " + findMax(arr));
    }
}