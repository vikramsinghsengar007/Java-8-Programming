package com.dataStructure.linkedlist;

public class SinglyLinkedList1 {
	private Node head;
	
	private void addFromBegining(int val) {
		Node node = new Node(val);
		if (head != null) {
			node.next = head;
		}
		head = node;
	}

	private void addFromLast(int val){
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
	
	
	private void detectLoop(){
		Node firstPointer = head, secondPointer = head;
		while(firstPointer != null && secondPointer !=null && firstPointer.next != null){
			firstPointer = head.next;
			secondPointer = head.next.next;
			if(firstPointer == secondPointer){
				System.out.println("deducted loop : "+secondPointer);
			break;	
			}
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList1  linkedList = new SinglyLinkedList1();
		linkedList.addFromBegining(1); linkedList.addFromBegining(2); linkedList.addFromBegining(3);
		linkedList.display(linkedList);
		
		
		  SinglyLinkedList1 linkedList1 = new SinglyLinkedList1();
		  linkedList1.addFromLast(4); linkedList1.addFromLast(5);
		  linkedList1.addFromLast(6); 
		  linkedList.display(linkedList1);
		 
		
		 
		//linkedList1.detectLoop();
		
	}
	
	void display(SinglyLinkedList1 linkedList) {
		Node temp = linkedList.head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "SinglyLinkedList1 [head=" + head.display() + "]";
	}
	
	
}