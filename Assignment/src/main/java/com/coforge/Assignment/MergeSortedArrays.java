package com.coforge.Assignment;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array
        
        // Compare elements from both arrays and insert the smaller one
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements from arr1, if any
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        
        // Copy remaining elements from arr2, if any
        while (j < n2) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int[] merged = merge(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}