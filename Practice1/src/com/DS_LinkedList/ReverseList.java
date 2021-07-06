package com.DS_LinkedList;

public class ReverseList {

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtLast("1");
        list.insertAtLast("2");
        list.insertAtLast("3");
        list.insertAtLast("4");
        list.insertAtLast("5");
        list.insertAtLast("6");
        list.printList();
        System.out.println("----After reverse-----");
        Node head = reverseList(list);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static Node reverseList(LinkList list) {
        Node current = list.head;
        Node prev = null;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
