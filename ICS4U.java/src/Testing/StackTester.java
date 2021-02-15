/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import edu.hdsb.gwss.ics4u.u5.Stack;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author nwu10
 */
public class StackTester {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        //MAKING URL'S
        String str = "https://gws.hdsb.ca/";
        char letter = 'A';
        URL[] url = new URL[20];

        for (int i = 0; i < 20; i++) {
            url[i] = new URL(str + letter);
            letter++;
        }

        //TESTING STACK CLASS
        Stack x = new Stack();

        //EMPTY STACK
        emptyStack(x);

        //FILLING UP THE STACK
        for (int i = 0; i < x.capacity() - 1; i++) {
            x.push(url[i]);
            assert (x.size() == i + 1);
            assert (x.capacity() == 11);
            assert (x.peek() == url[i]);
            assert (x.isEmpty() == false);
            assert (x.isFull() == false);
            assert (x.pop() == url[i]);
            x.push(url[i]);
        }

        //FULL
        x.push(url[0]);
        assert (x.size() == x.capacity());
        assert (x.capacity() == 11);
        assert (x.peek() == url[0]);
        assert (x.isEmpty() == false);
        assert (x.isFull() == true);

        //ATTEMPT OVERLOADING
        x.push(url[1]);
        assert (x.peek() == url[0]);

        //EMPTY STACK
        x.makeEmpty();
        emptyStack(x);

        //PUSHING AND POPING AFTER DOING MULTIPLE OPERATIONS
        x.push(url[14]);
        assert (x.pop() == url[14]);
        x.push(url[2]);
        assert (x.peek() == url[2]);
    }

    //EMPTY STACK CHECKER
    public static void emptyStack(Stack x) {
        assert (x.size() == 0);
        assert (x.capacity() == 11);
        assert (x.pop() == null);
        assert (x.peek() == null);
        assert (x.isEmpty() == true);
        assert (x.isFull() == false);
    }
}
