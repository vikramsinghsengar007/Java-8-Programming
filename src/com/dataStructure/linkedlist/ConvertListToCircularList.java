package com.dataStructure.linkedlist;

public class ConvertListToCircularList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFromLast(22);
        linkedList.addFromLast(33);
        linkedList.addFromLast(44);
        linkedList.addFromLast(55);
        convertSinglyLinkedListToCircularList(linkedList);
System.out.println("------------------------------------------------------\n");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFromBegin(22);
        doublyLinkedList.addFromBegin(33);
        doublyLinkedList.addFromBegin(44);
        doublyLinkedList.addFromBegin(55);
        convertDoublyLinkedListToCircularList(doublyLinkedList);
    }

    public static void convertSinglyLinkedListToCircularList(SinglyLinkedList singlyLinkedList){
        Node current = singlyLinkedList.head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("before circular last next is : "+ current.display());
        current.next = singlyLinkedList.head;
        System.out.println("after circular last next is : "+current.display());
        System.out.println("where next is : "+current.next.display());
    }
    public static void convertDoublyLinkedListToCircularList(DoublyLinkedList doublyLinkedList){
        Node current = doublyLinkedList.head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("before circular last next is : "+ current.display());
        current.next = doublyLinkedList.head;
        System.out.println("after circular last next is : "+current.display());
        System.out.println("where next is : "+current.next.display());
    }
}
