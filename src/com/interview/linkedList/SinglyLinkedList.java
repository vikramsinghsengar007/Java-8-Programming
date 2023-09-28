package com.interview.linkedList;

public class SinglyLinkedList {
	public Node head;

	public SinglyLinkedList() {
	}

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		if (head != null) {
			Node tempNode = head;
			node.next = tempNode;
		}
		head = node;
	}
	
	public void iterate() {
		Node tempHead = head;
		
		while(tempHead != null) {
			System.out.println(tempHead.data);
			tempHead = tempHead.next;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.add(10);
		linkedList.add(200);
		linkedList.add(-1);
		linkedList.add(0000);
		linkedList.add(1200);
		linkedList.iterate();
	}

}
