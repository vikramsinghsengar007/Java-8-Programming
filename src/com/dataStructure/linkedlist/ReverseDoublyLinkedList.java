package com.dataStructure.linkedlist;

public class ReverseDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFromBegin(22);
        linkedList.addFromBegin(33);
        linkedList.addFromBegin(44);
        linkedList.addFromBegin(55);
        DoublyLinkedList reverse = reverse(linkedList);
        reverse.printlist(reverse.head);
    }

    public static DoublyLinkedList reverse(DoublyLinkedList doublyLinkedList){
        Node currentNode = doublyLinkedList.head;
        Node previousNode = null;
        Node nextNode;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        doublyLinkedList.head = previousNode;
        return doublyLinkedList;
    }

}
