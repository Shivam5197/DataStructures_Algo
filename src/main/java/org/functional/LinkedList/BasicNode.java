package org.functional.LinkedList;

public class BasicNode {

    int data;
    BasicNode next;


    BasicNode(int data, BasicNode next) {
        this.data = data;
        this.next = next;
    }

    BasicNode(int data) {
        this.data = data;
        this.next = null;
    }
}
