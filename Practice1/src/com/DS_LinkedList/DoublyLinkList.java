package com.DS_LinkedList;

public class DoublyLinkList {

    DoublyNode head;

    public DoublyLinkList() {
        super();
        this.head = null;
    }

    public void insertAtBegining(int data) {
        DoublyNode node = new DoublyNode(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            node.prev = node;
            head = node;
        }
    }

    public void insertAtLast(int data) {
        DoublyNode node = new DoublyNode(data);
        if (head == null) {
            head = node;
        } else {
            DoublyNode current = head;
            while (current != null) {
                current = current.next;
            }
            current = node;
            node.prev = current;
        }
    }

    public void insertAfterData(int data, int newNode) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            DoublyNode current = head;
            while (current != null) {
                if (current.data == data) {
                    DoublyNode node = new DoublyNode(newNode);
                    DoublyNode next = current.next;
                    if (next != null) {
                        current.next = node;
                        node.next = next;
                        node.prev = current;
                        next.prev = node;
                    } else {
                        current.next = node;
                        node.prev = current;
                    }
                }
                current = current.next;
            }
        }
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteFromLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            DoublyNode current = head;
            if (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void printForward() {
        DoublyNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void printBackward() {
        DoublyNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
        }

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.prev;
        }
    }
}
