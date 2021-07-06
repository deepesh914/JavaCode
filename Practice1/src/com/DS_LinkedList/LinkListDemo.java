package com.DS_LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		/*list.AddNodeBegining("A");
		list.AddNodeBegining("B");
		list.AddNodeBegining("C");
		list.AddNodeBegining("D");
		list.printList();//D C B A (we got o/p as a STACK)
	
		list.insertAtLast("E");
		list.insertAtLast("F");
		list.insertAtLast("G");
		list.insertAtLast("H");
		list.printList();//E F G H (we got o/p as a QUEUE)
		
		list.insertAtLastWithoutTail("A");
		list.insertAtLastWithoutTail("B");
		list.insertAtLastWithoutTail("C");
		list.insertAtLastWithoutTail("D");
		list.printList(); // A B C D (we got o/p as a QUEUE)
*/		
		
		list.insertAtLastWithoutTail("A");
		list.insertAtLastWithoutTail("B");
		list.insertAtLastWithoutTail("C");
		list.insertAtLastWithoutTail("D");
		list.insertAfter("B", "E");
		list.printList();
		
		//list.deleteFromStart();
		//list.deleteFromLast();
		list.deleteNode("E");
		System.out.println("Delete from Middle");
		list.printList();
	}
}
