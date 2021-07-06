package com.DS_LinkedList;

public class ReverseLinkList {

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.insertAtLastWithoutTail("1");
        list.insertAtLastWithoutTail("2");
        list.insertAtLastWithoutTail("3");
        list.insertAtLastWithoutTail("4");
        list.insertAtLastWithoutTail("5");
        list.printList();
        System.out.println("----After reversing the list----");
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
