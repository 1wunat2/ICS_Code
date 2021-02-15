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
public class BrowserHistory implements BrowserHistoryInterface {

    //VARIABLES
    private Stack fwd, bwd;
    private URL current;

    public BrowserHistory() {
        this(11);
    }

    public BrowserHistory(int size) {
        fwd = new Stack(size);
        bwd = new Stack(size);
    }

    @Override
    public URL back() {
        if (!bwd.isEmpty()) {
            fwd.push(current);
            current = bwd.pop();
            return current;
        }
        return null;
    }

    @Override
    public URL forward() {
        if (!fwd.isEmpty()) {
            bwd.push(current);
            current = fwd.pop();
            return current;
        }
        return null;
    }

    @Override
    public void visit(URL value) {
        if (value != null) {
            bwd.push(current);
            current = value;
        }
    }
}
