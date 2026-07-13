package com.coforge.Assignment;

import java.util.*;
public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sorted = {1, 3, 5, 7, 9, 11};
        int key = 7;
        int index = binarySearch(sorted, key);
        System.out.println("Binary search " + key + ": index " + index);
    }
}
