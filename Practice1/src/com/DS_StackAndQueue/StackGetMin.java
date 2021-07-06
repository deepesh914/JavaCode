package com.DS_StackAndQueue;

import java.util.Stack;

public class StackGetMin {

    Stack<Integer> st       = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int data) {
        st.push(data);
        if (minStack.isEmpty()) {
            minStack.push(data);
        } else {
            int temp = minStack.peek();
            if (data < temp) {
                minStack.push(data);
            }
        }
    }

    public int pop() {
        int data = st.pop();
        if (data == minStack.peek()) {
            minStack.pop();
        }
        return data;
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        StackGetMin getMin = new StackGetMin();

        int[] arr = { 1, 0, 2, 4, -1, 8, 9, 12 };

        for (int i = 0; i < arr.length; i++) {
            getMin.push(arr[i]);
        }

        System.out.println(getMin.getMin());
        getMin.pop();
        getMin.pop();
        getMin.pop();
        getMin.pop();
        System.out.println(getMin.getMin());
        getMin.pop();
        getMin.pop();
        getMin.pop();
        System.out.println(getMin.getMin());
    }
}