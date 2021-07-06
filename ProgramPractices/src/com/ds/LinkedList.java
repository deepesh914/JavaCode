package com.ds;

public class LinkedList {

    Node head;

    public void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }

    }

    public void addAtBegin(int data) {
        Node t1 = new Node(data);
        if (head == null) {
            head = t1;
        } else {
            Node t2 = head;
            head = t1;
            head.next = t2;
        }
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            if (current.next == null) {
                head = null;
                return;
            }
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void insertValueAfter(int data, int value) {
        Node v = new Node(value);
        Node current = head;
        while (current.data != data) {
            current = current.next;
        }
        if (current.data == data) {
            v.next = current.next;
            current.next = v;
        } else {
            System.out.println("Data not found");
        }

    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.add(2);
        ll.add(5);
        // ll.add(1);
        // ll.addAtBegin(3);
        // ll.deleteAtLast();
        ll.insertValueAfter(5, 10);
        ll.print();
    }
}
