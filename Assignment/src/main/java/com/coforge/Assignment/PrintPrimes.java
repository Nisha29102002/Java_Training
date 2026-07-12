package com.coforge.Assignment;

import java.util.*;

public class PrintPrimes {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static void printPrimes(int[] arr) {
        for (int x : arr)
            if (isPrime(x))
                System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 7, 2, 15, 3, 8};
        System.out.print("Primes: ");
        printPrimes(arr);
    }
}