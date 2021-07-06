package com.StackAndQueue;

public class Stack {

    int[] arr;
    int   top;
    int   maxSize;

    public Stack(int size) {
        this.top = -1;
        arr = new int[size];
        this.maxSize = size;
    }

    public void push(int data) {
        if (!isFull())
            arr[++top] = data;
        else
            System.out.println("Stack is full");
    }

    public int pop() {
        if (!isEmpty())
            return arr[top--];
        else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (maxSize - 1));
    }
}
