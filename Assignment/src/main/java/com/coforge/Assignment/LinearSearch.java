package com.coforge.Assignment;

import java.util.Scanner;
public class LinearSearch {

    public static boolean isPresent(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;   // Found
            }
        }

        return false;   // Not found
    }

    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 104, 105};
        int id = 103;

        if (isPresent(ids, id)) {
            System.out.println("ID is present.");
        } else {
            System.out.println("ID is not present.");
        }
    }
}
