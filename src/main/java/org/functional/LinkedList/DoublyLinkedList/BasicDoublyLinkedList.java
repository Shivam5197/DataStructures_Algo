package org.functional.LinkedList.DoublyLinkedList;

public class BasicDoublyLinkedList {

    int data;
    BasicDoublyLinkedList next;
    BasicDoublyLinkedList prev;


    public BasicDoublyLinkedList(int data, BasicDoublyLinkedList next, BasicDoublyLinkedList prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public BasicDoublyLinkedList(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public BasicDoublyLinkedList(int data,BasicDoublyLinkedList next){
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        BasicDoublyLinkedList current = this;
        while (current != null) {
            sb.append(current.data).append(" <-> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
