package com.coforge.Assignment;

import java.util.*;

public class PrintEven {
    static void printEven(int[] arr) {
        for (int x : arr)
            if (x % 2 == 0)
                System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 7, 2, 15, 3, 8};
        System.out.print("Even numbers: ");
        printEven(arr);
    }
}