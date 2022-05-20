package com.employee.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArraySequence {

    /**
     * method to remove duplicates from array
     *
     * @param arr
     * @return Integer array
     */
    public static Integer[] setToArray(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int setLength = set.size();
        Integer[] new_arr = new Integer[setLength];
        int add = 0;
        for (Integer i : set) {
            new_arr[add++] = i;
        }
        return new_arr;
    }

    /**
     * method to get longest subsequence of consecutive elements
     *
     * @param result
     * @return Integer count
     */
    public static int resultCount(Integer[] result) {
        int count = 0, k = 3;
        for (int j = 1; j < result.length; j++) {
            if ((result[j] - result[0]) >= k) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements to be added :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements to be added :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Integer[] result = setToArray(arr);
            int LongestSequence = resultCount(result);
            System.out.println("The longest count is : " + LongestSequence);
        }
    }
}