package com.dataStructure.linkedlist;

public class Node<E> {
	public Node<?> next;
	public Node<?> prev;
	public E data;
	public Node(E data) {
		this.data = data;
	}
	
	public String display() {
		return "Node [next=" + next + ", prev=" + prev + ", data=" + data + "]";
	}
	
	
	
	
}
