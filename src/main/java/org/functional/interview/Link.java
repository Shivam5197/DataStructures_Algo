package org.functional.interview;

public class Link{

    Integer value;
    Link next;

    Link(Integer value, Link next){
        this.value = value;
        this.next = next;
    }

    Link(Integer value){
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Link{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}