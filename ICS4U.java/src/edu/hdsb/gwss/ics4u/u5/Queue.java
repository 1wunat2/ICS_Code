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
public class Queue implements URLQueueInterface {

    private URL[] data;
    private int front, back;

    //CONSTRUCTORS
    public Queue() {
        this(11);
    }

    public Queue(int size) {
        if (size < 1) {
            size = 11;
        }
        data = new URL[size];
        front = -1;
        back = -1;
    }

    @Override
    public URL peek() {
        //RETURN TOP VALUE IF IT EXISTS
        if (size() > 0) {
            return data[back];
        }
        return null;
    }

    @Override
    public void enqueue(URL value) {
        //CHECK IF VALID DATA
        if (value != null && size() < capacity()) {
            //MOVE POINTERS
            if (isEmpty()) {
                front++;
            }
            back = (back + 1) % capacity();
            //STORE DATA
            data[back] = value;
        }
    }

    @Override
    public URL dequeue() {
        boolean empty = false;
        //CHECK IF THERES A VALUE TO REMOVE
        if (!isEmpty()) {
            //CHECK IF IT WOULD BE EMPTY AFTER BEING REMOVED
            if (size() == 1) {
                empty = true;
            }
            //GET THE URL
            URL n = data[front];
            front = (front + 1) % capacity();
            //IF IT SHOULD BE EMPTY MAKE EMPTY
            if (empty) {
                makeEmpty();
            }
            //RETURN
            return n;
        }
        return null;
    }

    @Override
    public int size() {
        //SIZE 0
        if (isEmpty()) {
            return 0;
        }
        //NO LOOP AROUND
        if (back >= front) {
            return back - front + 1;
        }
        //LOOP AROUND
        return capacity() - front + back + 1;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return size() == capacity();
    }

    @Override
    public void makeEmpty() {
        //RESET POINTER
        front = -1;
        back = -1;
    }

}
