package com.DS_LinkedList;

public class FindLoop {

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.insertAtStart("10");
        Node t2 = list.insertAtLastNode("20");
        Node t3 = list.insertAtLastNode("30");
        Node t4 = list.insertAtLastNode("40");
        Node t5 = list.insertAtLastNode("50");
        t5.next = t3;

        // System.out.println(detectLoopAndReturnNode(list).data);
        detectLoopAndRemoveloop(list);
    }

    private static void detectLoopAndRemoveloop(LinkList list) {
        boolean loop = false;
        Node slow = list.head;
        Node fast = list.head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow.data == fast.data) {
                loop = true;
                break;
            }
        }
        if (loop) {
            slow = list.head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
