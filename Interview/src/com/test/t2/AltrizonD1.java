package com.test.t2;

public class AltrizonD1 {

    public static void main(String[] args) {
        Node l1 = new Node("1");
        l1.next = new Node("2");
        l1.next.next = new Node("3");
        l1.next.next.next = new Node("4");
        Node node4 = l1.next.next.next;
        node4.next = new Node("5");
        node4.next.next = new Node("6");

        Node l2 = new Node("7");
        l2.next = new Node("8");
        l2.next.next = node4;

        findConversingNode(l1, l2);
    }

    public static Node findConversingNode(Node l1, Node l2) {
        int count1 = 0;
        Node n1 = l1;
        while (n1 != null) {
            count1++;
            n1 = n1.next;
        }

        int count2 = 0;
        Node n2 = l2;
        while (n2 != null) {
            count2++;
            n2 = n2.next;
        }

        int diff = count1 - count2;

        if (diff >= 0) {
            while (diff != 0) {
                l1 = l1.next;
                diff--;
            }
        } else {
            while (diff != 0) {
                l2 = l2.next;
                diff++;
            }
        }

        Node current1 = l1;
        Node current2 = l2;

        while (current1.data != current2.data) {
            current1 = current1.next;
            current2 = current2.next;
        }
        System.out.println("data: " + current1.data);
        return current1;
    }
}


class Node {
    Node          next;
    public String data;

    public Node(String data) {
        this.next = null;
        this.data = data;
    }

    public Node getNode() {
        return this.next;
    }

    public void setNode(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}