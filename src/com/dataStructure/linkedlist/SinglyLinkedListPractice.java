package com.dataStructure.linkedlist;

public class SinglyLinkedListPractice {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFromBegining(1); linkedList.addFromBegining(2); linkedList.addFromBegining(3);
        linkedList.display(linkedList);

        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.addFromLast(4); linkedList1.addFromLast(5);
        linkedList1.addFromLast(6);
        linkedList.display(linkedList1);
        linkedList1.head.next.next.next= linkedList1.head;

        linkedList1.detectLoop(linkedList1);


    }
}
