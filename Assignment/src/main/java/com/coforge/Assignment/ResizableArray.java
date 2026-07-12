package com.coforge.Assignment;

import java.util.*;

public class ResizableArray {
    int[] data;
    int size;
    int capacity;

    ResizableArray(int cap) {
        data = new int[cap];
        size = 0;
        capacity = cap;
    }

    void push(int value) {
        if (size == capacity) {
            capacity *= 2;
            data = Arrays.copyOf(data, capacity);
        }
        data[size++] = value;
    }

    void print() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ResizableArray ra = new ResizableArray(2);
        ra.push(10);
        ra.push(20);
        ra.push(30);
        System.out.print("Resizable array: ");
        ra.print();
    }
}