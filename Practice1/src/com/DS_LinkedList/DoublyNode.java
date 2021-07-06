package com.DS_LinkedList;

public class DoublyNode {

	int data;
	DoublyNode next;
	DoublyNode prev;
	
	public DoublyNode(int data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
}
