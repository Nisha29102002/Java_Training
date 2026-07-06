package com.coforge.Assignment;

import java.util.*;
public class CountOccurences{
    static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int x : arr)
            if (x == key)
                count++;
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 7, 2, 15, 3, 8, 9};
        int key = 9;
        System.out.println("Count of " + key + ": " + countOccurrences(arr, key));
    }
}