package com.coforge.Assignment;

import java.util.*;


public class SecondMax {
    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 7, 2, 15, 3, 8};
        System.out.println("Second max: " + secondMax(arr));
    }
}