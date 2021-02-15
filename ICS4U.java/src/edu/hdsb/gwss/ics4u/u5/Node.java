/**
 * Node.
 *
 * @author Wm.Muir
 * @version 2020-21.Q1
 */
package edu.hdsb.gwss.ics4u.u5;

import java.net.URL;

/**
 * TODO
 */
public class Node implements NodeInterface {

    private URL current;
    private Node next, previous;

    public Node(URL current) {
        this.current = current;
    }

    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public void setNext(Node node) {
        //SETS THE NEXT POINTER
        next = node;
        if (next != null && next.getPrevious() == null) {
            next.setPrevious(this);
        }
    }

    @Override
    public Node getPrevious() {
        return previous;
    }

    @Override
    public void setPrevious(Node node) {
        //SETS THE PREVIOUS POINTER
        previous = node;
        if (previous != null && previous.getNext() == null) {
            previous.setNext(this);
        }
    }

    @Override
    public URL getValue() {
        return current;
    }

}
