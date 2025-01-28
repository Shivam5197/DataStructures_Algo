package org.functional.LinkedList;

import static org.functional.LinkedList.CountOfLinkedList.convertArrayToLL;

public class RemoveNodes {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

      BasicNode nodes =  convertArrayToLL(arr);
        System.out.println("Before removing anything " +nodes.toString());
 //           removeTail(nodes);
//          removeHead(nodes);
        removeByIndex(nodes,3);
        removeByElement(nodes , 7);
    }


    static void removeHead(BasicNode node){
        BasicNode temp = node;
        if(node == null){
            return ;
        }
        node =   node.next;
        System.out.println("Head is removed  => "+node.toString());
    }

    static void removeTail(BasicNode head){
        if(head == null || head.next == null){
            return;
        }
        BasicNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        System.out.println( "Tail is removed > "+head.toString());
    }

    static void removeByIndex(BasicNode head , int index) {

        if(head == null){
            return;
        }
        if(index == 1){
            head = head.next;
        }
        BasicNode tmp = head;
        BasicNode pre = null;
        int count = 0;

        while(tmp !=null){
            count++;
            if(count == index){
                pre.next = pre.next.next;
                break;
            }
            pre = tmp;
            tmp = tmp.next;
        }
        System.out.println("After removing " +index+ " => " + head.toString());
    }

    static void removeByElement(BasicNode head , int element) {

        if(head == null){
            return;
        }
        if(head.data == element){
            head = head.next;
            System.out.println("=> " + head.toString());
        }
        BasicNode tmp = head;
        BasicNode pre = null;

        while(tmp !=null){
            if(tmp.data == element){
                pre.next = pre.next.next;
                break;
            }
            pre = tmp;
            tmp = tmp.next;
        }
        System.out.println("After removing " +element+ " => " + head.toString());
    }


}
