package com.employee.exercise;

import java.util.Scanner;

public class rotateArray {

    /**
     * method to rotate elements of array from left to right
     *
     * @param arr
     * @param n
     * @return integer array
     */
    public static int[] moveArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int move = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = move;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements to be added :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Enter the no of rotations to be performed");
            int k = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements to be added :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = moveArray(arr, k);
            for (int i = 0; i < result.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
