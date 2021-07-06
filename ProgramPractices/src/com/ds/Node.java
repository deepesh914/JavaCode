package com.ds;

public class Node {

    Node       next;
    public int data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        super();
        this.next = null;
        this.data = data;
    }

}
