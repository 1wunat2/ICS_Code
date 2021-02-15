/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u5;

import java.net.URL;

/**
 *
 * @author 4U-Nathan
 */
public class Stack implements URLStackInterface {

    //VARIABLES
    private URL[] data;
    private int top;

    //CONSTRUCTOR
    public Stack() {
        this(11);
    }

    public Stack(int size) {
        if (size < 1) {
            size = 11;
        }
        data = new URL[size];
        top = -1;
    }

    @Override
    public URL peek() {
        //LOOK AND THE FIRST ELEMENT IN THE STACK IF IT EXIST
        if (!isEmpty()) {
            return data[top];
        }
        return null;
    }

    @Override
    public URL pop() {
        //GET THE FIRST VALUE AND REMOVE IT IF IT EXISTS
        if (!isEmpty()) {
            URL n = data[top];
            top--;
            return n;
        }
        return null;
    }

    @Override
    public void push(URL value) {
        //ADD DATA IF THERE IS ROOM AND IS A VALID URL
        if (size() != capacity() && value != null) {
            top++;
            data[top] = value;
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return size() == capacity();
    }

    @Override
    public void makeEmpty() {
        top = -1;
    }

}
