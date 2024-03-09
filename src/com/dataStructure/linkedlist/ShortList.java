package com.dataStructure.linkedlist;

public class ShortList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFromBegining(1); linkedList.addFromBegining(2); linkedList.addFromBegining(3);
        linkedList.display(linkedList);

        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.addFromLast(5);
        linkedList1.addFromLast(4);
        linkedList1.addFromLast(6);
        linkedList1.addFromLast(2);
        linkedList1.display(linkedList1);

        //WAP to detect loop
       /* linkedList1.head.next.next.next= linkedList1.head;
        linkedList1.detectLoop(linkedList1);*/


        //WAP to sort list in asc order
        linkedList1.sortList(linkedList1);

    }
}
