package org.functional.interview;

public class LinkedListTest {

    public static void main(String[] args) {

        Link lk1 = new Link(12);
        Link lk2 = new Link(11,lk1);
        Link lk3 = new Link(10,lk2);
        Link lk4 = new Link(9,lk3);
        Link lk5 = new Link(8,lk4);

//        addDataIntoList(7,lk5);
        Link lk6 = new Link(6,addDataIntoList(7,lk5));

        System.out.println(lk6.toString());

    }

    static Link addDataIntoList(Integer value, Link lkd){
        Link newLkd = null;
        if(value != null){
             newLkd = new Link(value,lkd);
        }else{
            System.out.println("Value Cannot be null");
        }
    return newLkd;
    }

    static Link removeDataIntoList(Integer value, Link lkd){
        Link newLkd = null;

        if(lkd.next != null){
            Link  prev = lkd.next;
            newLkd = new Link(value,prev);

        }else{
            System.out.println("Value Cannot be null");
        }
        return newLkd;
    }


}


