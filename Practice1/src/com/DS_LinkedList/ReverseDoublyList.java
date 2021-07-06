package com.DS_LinkedList;

public class ReverseDoublyList {

	public static void main(String[] args) {
		DoublyLinkList list = new DoublyLinkList();
		list.insertAtBegining(10);
		list.insertAtBegining(20);
		list.insertAtBegining(30);
		list.insertAtBegining(40);
		reverseList(list);
		list.printForward();
	}

	private static void reverseList(DoublyLinkList list) {
		DoublyNode current = list.head;
		DoublyNode temp = null;
		
		if(current.next==null){
			return;
		}
		
		while(current!=null){
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		list.head = temp.prev;//Not working
	}

}
