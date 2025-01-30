package org.functional.LinkedList.DoublyLinkedList;

import org.functional.LinkedList.SingleLinkedList.BasicNode;

public class CountOfDoublyLinkedList {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        BasicDoublyLinkedList bs = new BasicDoublyLinkedList(arr[0]);
        BasicDoublyLinkedList head = convertArrayToLL(arr);
        System.out.println(getCount(head));
    }
    public static int getCount(BasicDoublyLinkedList head) {
        // code here
        BasicDoublyLinkedList temp = head;
        int count =0;
        while(temp != null ){
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static BasicDoublyLinkedList convertArrayToLL(int [] arr){
        if (arr == null || arr.length == 0) {
            return null;  // Handle empty or null array
        }
        BasicDoublyLinkedList head = new BasicDoublyLinkedList(arr[0]);
        BasicDoublyLinkedList prev = head;

        for (int i = 1; i < arr.length; i++) {
            BasicDoublyLinkedList tmp = new BasicDoublyLinkedList(arr[i], null, prev);
            prev.next = tmp;
            prev = tmp;
        }
        System.out.println(head.toString());
        return head;
    }

}
