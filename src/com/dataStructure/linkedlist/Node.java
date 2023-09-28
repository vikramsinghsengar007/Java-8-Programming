package com.dataStructure.linkedlist;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Node<?> node = (Node<?>) o;
		return Objects.equals(next, node.next) && Objects.equals(prev, node.prev) && Objects.equals(data, node.data);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
