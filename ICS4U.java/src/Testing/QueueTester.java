/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import edu.hdsb.gwss.ics4u.u5.Queue;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author nwu10
 */
public class QueueTester {

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

        //NEW QUEUE
        Queue x = new Queue();

        //EMPTY QUEUE
        emptyQueue(x);

        //ENQUEUE'ING AND DEQUEUE'ING
        for (int i = 0; i < x.capacity() - 3; i++) {
            x.enqueue(url[i]);
            assert (x.size() == 1);
            assert (x.capacity() == 11);
            assert (x.peek() == url[i]);
            assert (x.isEmpty() == false);
            assert (x.isFull() == false);
            assert (x.dequeue() == url[i]);
        }

        //FILLING UP THE STACK
        for (int i = 0; i < x.capacity() - 1; i++) {
            x.enqueue(url[i]);
            assert (x.size() == i + 1);
            assert (x.capacity() == 11);
            assert (x.peek() == url[i]);
            assert (x.isEmpty() == false);
            assert (x.isFull() == false);
        }
        x.enqueue(url[x.capacity() - 1]);
        x.enqueue(url[x.capacity()]);

        //DEQUEUE'ING THE FULL STACK
        for (int i = 0; i < x.capacity() - 1; i++) {
            assert (x.size() == 11 - i);
            assert (x.capacity() == 11);
            assert (x.isEmpty() == false);
            assert (x.dequeue() == url[i]);
            assert (x.isFull() == false);
        }
        assert (x.dequeue() == url[x.capacity() - 1]);

        //CHECKING EMPTY QUEUE
        emptyQueue(x);
        x.enqueue(url[15]);
        x.makeEmpty();
        emptyQueue(x);

        //LOOPING AROUND
        for (int i = 0; i < 5; i++) {
            x.enqueue(url[i]);
        }
        for (int i = 0; i < 2; i++) {
            x.dequeue();
        }

        for (int i = 5; x.size() < x.capacity() - 1; i++) {
            x.enqueue(url[i]);
            assert (x.size() == 4 + i - 5);
            assert (x.capacity() == 11);
            assert (x.isEmpty() == false);
            assert (x.isFull() == false);
        }
        x.enqueue(url[x.capacity() + 1]);
        assert (x.size() == 11);
        assert (x.capacity() == 11);
        assert (x.isEmpty() == false);
        assert (x.isFull() == true);

        for (int i = 0; i < x.capacity() - 1; i++) {
            assert (x.size() == 11 - i);
            assert (x.capacity() == 11);
            assert (x.isEmpty() == false);
            assert (x.dequeue() == url[2 + i]);
            assert (x.isFull() == false);
        }
        assert (x.dequeue() == url[x.capacity() + 1]);
        emptyQueue(x);

    }

    //EMPTY QUEUE CHECKER
    public static void emptyQueue(Queue x) {
        assert (x.size() == 0);
        assert (x.capacity() == 11);
        assert (x.dequeue() == null);
        assert (x.peek() == null);
        assert (x.isEmpty() == true);
        assert (x.isFull() == false);
    }

}
