package com.dataStructure.linkedlist;

public class DoublyLinkedList<E> {
	public Node<?> head;
	public Node<?> tail;
	
	
	
	
	public static void main(String[] args) {
		DoublyLinkedList<Object> linkedList = new DoublyLinkedList<>();
		linkedList.addFromBegin(1);
		linkedList.addFromBegin(2);
		linkedList.addFromBegin(3);
		linkedList.addFromBegin(4);
		
		linkedList.remove(4);
		linkedList.printlist(linkedList.head);
	}





	 public void printlist(Node node) 
	    { 
	        Node last = null; 
	        System.out.println("Traversal in forward Direction"); 
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            last = node; 
	            node = node.next; 
	        } 
	        System.out.println(); 
	        System.out.println("Traversal in reverse direction"); 
	        while (last != null) {
	            System.out.print(last.data + " ");
	            last = last.prev;
	        } 
	    } 



	@Override
	public String toString() {
		return "DoublyLinkedList [head=" + head.display() + ", tail=" + tail.display() + "]";
	}




	public void remove(E data) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.data.toString().equals(data.toString())) {
				
				
				       if (temp.next != null) { 
		        	temp = temp.next; 
		            temp.next.prev = temp.prev; 
		        }else {
		        	temp.prev.next = null;
		        	temp = temp.prev;
		        	break;
		        }
		  
		        // Change prev only if node to be deleted 
		        // is NOT the first node 
		        if (temp.prev != null) { 
		        	temp.prev = head.next;
		            temp.prev.next = temp; 
		        } 

				
			}else {
				temp = temp.next;
			}
		}
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((tail == null) ? 0 : tail.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoublyLinkedList other = (DoublyLinkedList) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		if (tail == null) {
			if (other.tail != null)
				return false;
		} else if (!tail.equals(other.tail))
			return false;
		return true;
	}





	public void addFromBegin(E val) {
		Node<E> newNode = new Node<>(val);
	    if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.prev = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
        	newNode.prev = tail;  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
	}

    public void middleOfDoublyList(DoublyLinkedList doublyLinkedList) {
		// for single step jump
		Node slow = doublyLinkedList.head;
		//for 2 step jump
		Node fast = doublyLinkedList.head;

		if(doublyLinkedList.head != null){
			while(fast !=null && fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
			}
		}
		System.out.println("middle Data Node from doublyLinkedList: "+ slow.display());
		System.out.println("middle Data from doublyLinkedList: "+ slow.data);
    }
}
