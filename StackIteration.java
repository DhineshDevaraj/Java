package com.employee.exercise;

import java.util.Stack;

public class StackIteration {

    /**
     * method to get iteration count to get given stack values
     *
     * @param stack1
     * @param stack2
     * @return count
     */
    private static int getIterationCount(Stack<Integer> stack1, Stack<Integer> stack2) {
        int count = 0;
        for (int i = 0; i < stack1.size() - 1; i++) {
            if (stack1.get(i) > stack1.get(i + 1)) {
                stack2.add(stack1.get(i));
                stack1.pop();
            } else {
                stack2.add(stack1.get(i));
                stack1.remove(stack1.get(i + 1));
            }
        }
        for (int i = 0; i < stack2.size(); i++) {
            System.out.println("The elements in the stack are " + stack2.get(i) + " ");
        }
        return count - 1;
    }

    /**
     * method to add multiple values into the stack
     *
     * @param a
     * @param stack
     * @return integer array of stack
     */
    public static int[] addMultiple(int[] a, Stack stack) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                stack.push(a[i]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, 5, 8, 4, 7, 10, 9};
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        addMultiple(a, stack1);
        System.out.println("The number of iteration required to get the given stack is : " + getIterationCount(stack1, stack2));
    }

}
