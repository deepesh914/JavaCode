package com.DS_StackAndQueue;

public class StackTest {

    public static void main(String[] args) {

        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6); // Stack is full

        while (!st.isEmpty()) {
            System.out.println(st.pop()); // 5 4 3 2 1
        }
        st.pop(); // Stack is empty
    }

}
