package com.DS_LinkedList;

public class LinkList {

    Node head;
    Node tail;

    public LinkList() {
        this.head = null;
        this.tail = null;
    }

    // Add node in the beginning
    public void AddNodeBegining(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
    }

    // Print node data
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Add node at the last
    public void insertAtLast(String data) {
        if (tail == null) {
            tail = new Node(data);
            head = tail;
        } else {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
        }
    }

    // Without tail
    public void insertAtLastWithoutTail(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void insertAfter(String data, String NewData) {
        Node current = head;
        Node nextAdd;
        while (current.data != data) {
            current = current.next;
        }
        nextAdd = current.next;
        Node temp = new Node(NewData);
        current.next = temp;
        temp.next = nextAdd;
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
            Node current = head;
            if (current.next == null) {
                current = null;
            } else {
                while (current.next.next != null) {
                    current = current.next;
                }
            }
            current.next = null;
        }
    }

    public void deleteNode(String data) {
        Node current = head;
        Node prev = null;
        /*
         * while(current.next.data!=data){ current = current.next; } current.next = current.next.next;
         */
        while (current.data != data) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }

    public void insertAtStart(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        System.out.println(head.data);
    }

    public Node insertAtLastNode(String data) {
        Node current = head;
        Node temp = null;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        temp = current.next;
        // System.out.println(temp.data);
        return temp;
    }
}
