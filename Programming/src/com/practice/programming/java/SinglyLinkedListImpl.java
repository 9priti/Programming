package com.practice.programming.java;
 
public class SinglyLinkedListImpl<T> {
 
    private Node11<T> head;
    private Node11<T> tail;
     
    public void add(T element){
         
        Node11<T> nd = new Node11<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        /**
         * check if the list is empty
         */
        if(head == null){
            //since there is only one element, both head and
            //tail points to the same object.
            head = nd;
            tail = nd;
        } else {
            //set current tail next link to new Node11
            tail.setNextRef(nd);
            //set tail as newly created Node11
            tail = nd;
        }
    }
     
    public void addAfter(T element, T after){
         
        Node11<T> tmp = head;
        Node11<T> refNode11 = null;
        System.out.println("Traversing to all Node11s..");
        /**
         * Traverse till given element
         */
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target Node11, add after this Node11
                refNode11 = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode11 != null){
            //add element after the target Node11
            Node11<T> nd = new Node11<T>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if(tmp == tail){
                tail = nd;
            }
            tmp.setNextRef(nd);
             
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
     
    public void deleteFront(){
         
        if(head == null){
            System.out.println("Underflow...");
        }
        Node11<T> tmp = head;
        head = tmp.getNextRef();
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted: "+tmp.getValue());
    }
     
    public void deleteAfter(T after){
         
        Node11<T> tmp = head;
        Node11<T> refNode11 = null;
        System.out.println("Traversing to all Node11s..");
        /**
         * Traverse till given element
         */
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target Node11, add after this Node11
                refNode11 = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode11 != null){
            tmp = refNode11.getNextRef();
            refNode11.setNextRef(tmp.getNextRef());
            if(refNode11.getNextRef() == null){
                tail = refNode11;
            }
            System.out.println("Deleted: "+tmp.getValue());
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
     
    public void traverse(){
         
        Node11<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getNextRef();
        }
    }
     
    public static void main(String a[]){
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.addAfter(76, 54);
        sl.deleteFront();
        sl.deleteAfter(76);
        sl.traverse();
         
    }
}
 
class Node11<T> implements Comparable<T> {
     
    private T value;
    private Node11<T> nextRef;
     
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node11<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(Node11<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}
