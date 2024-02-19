package com.dataStructure.linkedlist;

import java.util.ArrayList;

public class MiddleOfList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFromBegining(12);
        singlyLinkedList.addFromBegining(20);
        singlyLinkedList.addFromBegining(11);
        singlyLinkedList.addFromBegining(17);
        singlyLinkedList.addFromBegining(1);
        singlyLinkedList.addFromBegining(2);
        singlyLinkedList.middleOfSinglyList(singlyLinkedList);


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFromBegin(12);
        doublyLinkedList.addFromBegin(20);
        doublyLinkedList.addFromBegin(11);
        doublyLinkedList.addFromBegin(17);
        doublyLinkedList.addFromBegin(1);
        doublyLinkedList.addFromBegin(2);
        doublyLinkedList.addFromBegin(3);
        doublyLinkedList.addFromBegin(5);
        doublyLinkedList.middleOfDoublyList(doublyLinkedList);

    }
}
