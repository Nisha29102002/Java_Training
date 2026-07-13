package com.coforge.Assignment;

import java.util.*;

public class DeleteAtInddex {
    static int[] deleteAtIndex(int[] arr, int index) {
        int n = arr.length;
        int[] result = new int[n - 1];
        for (int i = 0, k = 0; i < n; i++)
            if (i != index)
                result[k++] = arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("After deletion: " + Arrays.toString(deleteAtIndex(arr, 2)));
    }
}