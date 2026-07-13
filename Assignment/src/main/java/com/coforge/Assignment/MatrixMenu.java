package com.coforge.Assignment;

import java.util.*;

public class MatrixMenu {
    static void inputMatrix(int[][] m, int r, int c, Scanner sc) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
    }

    static void printMatrix(int[][] m, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] res = new int[r][c];
        System.out.println("Enter matrix A:");
        inputMatrix(a, r, c, sc);
        System.out.println("Enter matrix B:");
        inputMatrix(b, r, c, sc);
        System.out.print("1.Add 2.Sub 3.Mul\nEnter choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    res[i][j] = a[i][j] + b[i][j];
            printMatrix(res, r, c);
        } else if (choice == 2) {
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    res[i][j] = a[i][j] - b[i][j];
            printMatrix(res, r, c);
        } else if (choice == 3) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < c; k++)
                        res[i][j] += a[i][k] * b[k][j];
                }
            }
            printMatrix(res, r, c);
        }
    }
}