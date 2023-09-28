package com.dataStructure.linkedlist;

import java.util.Objects;

public class SinglyLinkedList {
	public Node head;
	
	public void addFromBegining(int val) {
		Node node = new Node(val);
		if (head != null) {
			node.next = head;
		}
		head = node;
	}

	public void addFromLast(int val){
		Node node = new Node(val);
		if(head == null){
			head = node;
		}else{
			Node temp =head;
			while(temp.next != null)
				temp = temp.next;
				temp.next = node;
		}
	}


	@Override
	public String toString() {
		return "SinglyLinkedList{" +
				"head=" + head +
				'}';
	}

	public void detectLoop(SinglyLinkedList singlyLinkedList){
		Node head = singlyLinkedList.head;
		Node firstPointer = head, secondPointer = head;
		while(firstPointer != null && secondPointer !=null && firstPointer.next != null){
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next.next;
			if(firstPointer == secondPointer){
				System.out.println("deducted loop : "+secondPointer.display());
			break;	
			}
		}
	}

	
	void display(SinglyLinkedList linkedList) {
		Node temp = linkedList.head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SinglyLinkedList that = (SinglyLinkedList) o;
		return Objects.equals(head, that.head);
	}

	@Override
	public int hashCode() {
		return Objects.hash(head);
	}
}