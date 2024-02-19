package com.dataStructure.linkedlist;

public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFromLast(22);
        linkedList.addFromLast(33);
        linkedList.addFromLast(44);
        linkedList.addFromLast(55);
        SinglyLinkedList reverse = reverse(linkedList);
        reverse.display(reverse);
    }

    public static SinglyLinkedList reverse(SinglyLinkedList singlyLinkedList){
        Node currentNode = singlyLinkedList.head;
        Node previousNode = null;
        Node nextNode;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        singlyLinkedList.head = previousNode;
        return singlyLinkedList;
    }

}
