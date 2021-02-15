/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u5;

import java.net.URL;

/**
 *
 * @author nwu10
 */
public class URLLinkedList implements URLLinkedListInterface {

    //VARIABLES
    private Node head, tail;

    //CONSTRUCTOR
    public URLLinkedList() {
    }

    @Override
    public void addFirst(URL value) {
        //CHECK IF VALID
        if (value != null) {
            //CREATE NEW NODE
            Node node = new Node(value);
            //ADJUST POINTERS TO CONNECT NODE TO LINKED LIST
            if (size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                head.setPrevious(node);
                node.setNext(head);
                this.head = node;
            }
        }
    }

    @Override
    public void addLast(URL value) {
        //CHECK IF VALID
        if (value != null) {
            //CREATE NEW NODE
            Node node = new Node(value);
            //ADJUST POINTERS TO CONNECT NODE TO LINKED LIST
            if (size() == 0) {
                this.head = node;
                this.tail = node;
            } else {
                tail.setNext(node);
                node.setPrevious(tail);
                this.tail = node;
            }
        }
    }

    @Override
    public URL removeFirst() {
        //CHECK IF VALID
        if (head != null) {
            Node old = head;
            //CHANGE POINTERS
            if (size() > 1) {
                head.getNext().setPrevious(null);
                head = head.getNext();
                old.setNext(null);
                return old.getValue();
            }
            tail = null;
            head = null;
            //RETURN
            return old.getValue();
        }
        return null;
    }

    @Override
    public URL removeLast() {
        //CHECK IF VALID
        if (tail != null) {
            Node old = tail;
            //CHANGE POINTERS
            if (size() > 1) {
                tail.getPrevious().setNext(null);
                tail = tail.getPrevious();
                old.setPrevious(null);
                //RETURN
                return old.getValue();
            }
            tail = null;
            head = null;
            return old.getValue();
        }
        return null;
    }

    @Override
    public URL getFirst() {
        //CHECK IF VALID
        if (head != null) {
            return head.getValue();
        }
        return null;
    }

    @Override
    public URL getLast() {
        //CHECK IF VALID
        if (tail != null) {
            return tail.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        //VARIABLES
        Node pointer = head;
        int counter = 0;
        //LOOP TO COUNT ALL NODES
        while (pointer != null) {
            counter++;
            pointer = pointer.getNext();
        }
        //RETURN
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public void makeEmpty() {
        //RESET POINTERS
        head = null;
        tail = null;
    }

    @Override
    public boolean remove(URL value) {
        Node pointer = head;
        //FIND IF NODE EXIST IS THE LL
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.getNext();
        }

        //IF IT EXIST
        if (pointer != null) {
            //REMOVE THE NODE'S CONNECTION TO THE LL
            //USE BUILT ALREADY BUILT IN FUNCTIONS
            if (pointer == head) {
                removeFirst();
            } else if (pointer == tail) {
                removeLast();
            } else {
                pointer.getNext().setPrevious(pointer.getPrevious());
                pointer.getPrevious().setNext(pointer.getNext());
                pointer.setNext(null);
                pointer.setPrevious(null);
            }
            //RETURN
            return true;
        }
        //RETURN
        return false;
    }

    @Override
    public String toString() {
        //CALL RECURSIVE TO STRING
        if (head != null) {
            return "Head" + " | " + toString(head) + "Tail";
        }
        return null;
    }

    //RECURSION TOSTRING
    private String toString(Node x) {
        //WHILE ANOTHER NODE EXIST ADD IT TO THE STRING
        if (x != null) {
            return x.getValue() + "|" + toString(x.getNext());
        }
        return "";
    }
}
