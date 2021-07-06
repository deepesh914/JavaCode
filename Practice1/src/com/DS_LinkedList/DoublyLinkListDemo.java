package com.DS_LinkedList;

public class DoublyLinkListDemo {

	public static void main(String[] args) {

		DoublyLinkList list = new DoublyLinkList();
		list.insertAtBegining(50);
		list.insertAtBegining(40);
		list.insertAtBegining(30);
		list.insertAtBegining(20);
		list.insertAtBegining(10);
		list.printForward();
		list.insertAfterData(20, 25);
		System.out.println("After inserting 25");
		list.printForward();

	}

}
