package com.employee.exercise;

import java.util.Arrays;
import java.util.Stack;

public class StackPop {

    /**
     * method to get maximum number of elements from both the stack
     *
     * @param stack1
     * @param stack2
     * @return count
     */
    public static int getCount(Stack stack1, Stack stack2) {
        int sum = 0, k = 12, count = 0;
        Stack<Integer> temp = stack1;
        while (!temp.isEmpty()) {
            if (sum + temp.peek() < k) {
                temp.pop();
                count++;
            } else {
                temp = stack2;
                if (sum < k) {
                    sum += temp.peek();
                    temp.pop();
                    count++;
                } else break;
            }
        }
        return count;
    }

    /**
     * @param a
     * @param stack
     * @return integer array of stack
     */
    public static int[] addMultiple(int[] a, Stack stack) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                stack.push(a[i]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 5, 1, 6, 1};
        int[] b = new int[]{2, 5, 2, 1};
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        addMultiple(a, stack1);
        addMultiple(b, stack2);
        System.out.println("The maximum number of elements that can be removed from both the stack is : " + getCount(stack1, stack2));
    }
}
