/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import edu.hdsb.gwss.ics4u.u5.URLLinkedList;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author nwu10
 */
public class LinkedListTester {

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

        //NEW LINKED LIST
        URLLinkedList x = new URLLinkedList();

        //EMPTY LINKED LIST
        emptyLinkedList(x);

        //ADDING FIRST
        for (int i = 0; i < 5; i++) {
            x.addFirst(url[i]);
            assert (x.getFirst() == url[i]);
            assert (x.isEmpty() == false);
            assert (x.size() == i + 1);
            System.out.println(x.toString());
        }
        //ADDING LAST
        for (int i = 5; i < 10; i++) {
            x.addLast(url[i]);
            assert (x.getLast() == url[i]);
            assert (x.isEmpty() == false);
            assert (x.size() == i + 1);
            System.out.println(x.toString());
        }

        //REMOVE SPECIFIC
        assert (x.remove(url[19]) == false);
        assert (x.remove(url[4]) == true);

        //REMOVING FIRST
        for (int i = 0; i < 4; i++) {
            assert (x.removeFirst() == url[3 - i]);
            assert (x.isEmpty() == false);
            assert (x.size() == 8 - i);
            System.out.println(x.toString());
        }

        for (int i = 0; i < 4; i++) {
            assert (x.removeLast() == url[9 - i]);
            assert (x.isEmpty() == false);
            assert (x.size() == 4 - i);
            System.out.println(x.toString());
        }

        assert (x.removeLast() == url[5]);
        emptyLinkedList(x);

        x.addFirst(url[5]);
        assert (x.removeFirst() == url[5]);
        emptyLinkedList(x);

    }

    //EMPTY LINKED LIST
    public static void emptyLinkedList(URLLinkedList x) {
        assert (x.size() == 0);
        assert (x.isEmpty() == true);
        assert (x.getFirst() == null);
        assert (x.getLast() == null);
    }

}
