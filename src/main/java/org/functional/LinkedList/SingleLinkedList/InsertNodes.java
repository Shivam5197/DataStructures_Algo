package org.functional.LinkedList.SingleLinkedList;

import static org.functional.LinkedList.SingleLinkedList.CountOfLinkedList.convertArrayToLL;

public class InsertNodes {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        BasicNode nodes = convertArrayToLL(arr);
        System.out.println("Before Inserting anything " + nodes.toString());

 //       insertInBegining(nodes, 12);
//        insertAtLast(nodes, 56);
        insertAtIndex(nodes,100,3);
    }

    static void insertInBegining(BasicNode node, int value) {
        BasicNode bs = new BasicNode(value, node);
        System.out.println(bs.toString());
    }

    static void insertAtLast(BasicNode node, int value) {

        if (node == null) {
            System.out.println(new BasicNode(value).toString());
        }
        BasicNode tmp = node;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        BasicNode bs = new BasicNode(value);
        tmp.next = bs;
        System.out.println(node.toString());
    }

    static void insertAtIndex(BasicNode node, int value, int index) {
        if (node == null) {
            if (index == 1) {
                System.out.println(new BasicNode(value).toString());
            } else {
                System.out.println("Cannot do this ! ");
            }
        }

        if (index == 1) {
            BasicNode tmp = new BasicNode(value, node);
            System.out.println("After adding the value " + value + " at index => " + index + tmp.toString());
        }
        int count =0 ;
        BasicNode pre = null;
        BasicNode tmp = node;
        while (tmp.next != null) {
            count++;
            if (count == (index-1)){
                BasicNode bs = new BasicNode(value,tmp.next);
                tmp.next = bs;
                break;
            }
            tmp = tmp.next;
        }
        System.out.println(node.toString());
    }


}
