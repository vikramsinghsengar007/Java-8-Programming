package com.dataStructure.linkedlist;

public class SinglyLinkedList<E> {
	private Node<E> head;
	
	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head.next + "]";
	}

	public static void main(String[] args) {
		SinglyLinkedList<Object> linkedList = new SinglyLinkedList<>();
		linkedList.addFromBegin(1);
		linkedList.addFromBegin(2);
		linkedList.addFromBegin("three");
		System.out.println(linkedList.head.toString());
		
		SinglyLinkedList<Object> linkedList1 = new SinglyLinkedList<>();
		linkedList1.addFromLast(1);
		linkedList1.addFromLast(2);
		linkedList1.addFromLast("three");
		System.out.println(linkedList1.head.toString());
		
	}






	private void addFromBegin(E data) {
		Node<E> node = new Node<>(data);
		if(head == null) {
			head = node;
		}else {
			node.next  = head;
			head= node;
		}
	}
	
	private void addFromLast(E data) {
		Node<E> node = new Node<>(data);
		if(head == null) {
			head = node;
		}else {
			Node<?> temp = head;
			while(temp.next != null) {
				temp  =temp.next;
			}
				temp.next = node;
			
		}
	}
}
