package com.dataStructure.linkedlist;

import java.util.Objects;

public class SinglyLinkedList {
	public Node head;
	public int size;
	
	public void addFromBegining(int val) {
		Node node = new Node(val);
		if (head != null) {
			node.next = head;
		}
		head = node;
		size++;
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
		size++;
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

	public void sortList(SinglyLinkedList linkedList) {
		Node head = linkedList.head;
		Node nextHead = head.next;
		while(head!= null){
			if(head.data instanceof Integer) {
				Object firstData = head.data;
				int temp;
				while (head.next != null) {
					Object secondData = nextHead.data;
					int data1 = Integer.parseInt(firstData.toString());
					int data2 = Integer.parseInt(secondData.toString());
					if(data1 > data2){
						temp = (int) head.data;
						head.data = nextHead.data;
						nextHead.data = temp;
					}
					head = head.next;
				}
			}
			if(head == null) break;
		}
	}

	public void middleOfSinglyList(SinglyLinkedList singlyLinkedList){
		// for single step jump
		Node slow = singlyLinkedList.head;
		//for 2 step jump
		Node fast = singlyLinkedList.head;

		if(singlyLinkedList.head != null){
			while(fast !=null && fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
			}
		}
		System.out.println("middle Data Node : "+ slow.display());
		System.out.println("middle Data : "+ slow.data);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SinglyLinkedList that = (SinglyLinkedList) o;
		return Objects.equals(head, that.head);
	}

	public int getSize() {
		return size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(head);
	}
}