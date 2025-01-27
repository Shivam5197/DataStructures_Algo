package org.functional.LinkedList;

public class CountOfLinkedList {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        BasicNode bs = new BasicNode(arr[0]);
        BasicNode head = convertArrayToLL(arr);
        System.out.println(getCount(head));
    }
    public static int getCount(BasicNode head) {
        // code here
        BasicNode temp = head;
        int count =0;
        while(temp != null ){
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static BasicNode convertArrayToLL(int [] arr){
        BasicNode head = new BasicNode(arr[0]);
        BasicNode movers = head;

        for(int i=1;i<arr.length;i++){
            BasicNode tmp = new BasicNode(arr[i]);
            movers.next = tmp;
            movers = tmp;
        }
        return head;
    }


}
