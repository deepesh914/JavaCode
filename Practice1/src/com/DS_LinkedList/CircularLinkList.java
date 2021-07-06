package com.DS_LinkedList;

public class CircularLinkList {

    private Node tail;

    CircularLinkList() {
        tail = null;
    }

    public static void main(String[] args) {
        CircularLinkList list = new CircularLinkList();
        list.insertAtBegin("30");
        list.insertAtBegin("20");
        list.insertAtBegin("10");
        list.insertAtLast("40");
        list.printList();
        System.out.println("After removal from last");
        list.removeFromStart();
        list.printList();
    }

    // 1. Remove from start
    public void removeFromStart() {
        Node temp = tail.next;
        if (temp == null) {
            tail = null;
        } else {
            tail.next = temp.next;
        }
    }

    // 2. Remove from last
    public void removeFromLast() {

    }

    // 3. insert at beginning
    public void insertAtBegin(String data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            tail.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
        }
    }

    // 4. insert at last
    public void insertAtLast(String data) {
        Node node = new Node(data);
        insertAtBegin(data);
        tail = tail.next;
    }

    // 5. print the list
    public void printList() {
        Node current = tail.next;
        while (current != tail) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
}