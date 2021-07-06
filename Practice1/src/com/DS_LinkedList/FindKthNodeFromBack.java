package com.DS_LinkedList;

public class FindKthNodeFromBack {
	
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.AddNodeBegining("1");
		list.insertAtLastNode("2");
		list.insertAtLastNode("3");
		list.insertAtLastNode("4");
		list.insertAtLastNode("5");
		list.insertAtLastNode("6");
		list.insertAtLastNode("7");
		list.insertAtLastNode("8");
		list.printList();
		String m = "4";
		Node mth = findKthNodeFromFront(m,list);
		System.out.println("We found this node: "+mth.data);
		int last = 3;
		Node kth = findKthNodeFromBack(last,list);
		System.out.println("We found node from last: " + kth.data);
		
	}

	private static Node findKthNodeFromBack(int last, LinkList list) {
		Node current = list.head;
		Node prev = list.head;
		
		while(last!=0){
			prev = prev.next;
			last--;
		}
		//System.out.println(prev.data);
		while(current!=null && prev!=null){
			current = current.next;
			prev= prev.next;
		}		
		return current;
	}

	private static Node findKthNodeFromFront(String kth, LinkList list) {
		Node current = list.head;
		int count = 0;
		Node prev = null;
		while(current!=null && current.data!=kth){
			current = current.next;
			count++;
		}
		System.out.println("After "+count+ " Node from front");
		prev = current;
		return prev;
	}
}


