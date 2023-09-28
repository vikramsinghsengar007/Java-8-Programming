package com.interview.itc;

import java.util.HashSet;

public class FindLoopInSinglyLinkedList {
	Node head;
	
	static class Node{
		@SuppressWarnings("unused")
		private Integer data;
		public Node next;
		Node(int data) { 
            this.data = data; 
            this.next = null; 
        }
	}
	
	public void add(int data){
        Node newNode = new Node(data); 
        newNode.next = head;
        head = newNode; 
    } 
	
	static boolean detectLoop(Node node) {
		HashSet<Node> set = new HashSet<Node>();
		while (node != null) {
			
			if (set.contains(node)) {
				return true;
			}
			set.add(node);
			node = node.next;
		}

		return false;
	} 
	public static void main(String[] args) {
		FindLoopInSinglyLinkedList singlyLinkedList = new FindLoopInSinglyLinkedList();
		singlyLinkedList.add(1);
		singlyLinkedList.add(2);
		singlyLinkedList.add(3);
		singlyLinkedList.add(4);
		singlyLinkedList.add(5);
		
		singlyLinkedList.head.next.next.next.next = singlyLinkedList.head;
		if(detectLoop(singlyLinkedList.head)) {
			System.out.println("loop occured");
		}else {
			System.out.println("no loop occured");
		}
			
		
	}
}
