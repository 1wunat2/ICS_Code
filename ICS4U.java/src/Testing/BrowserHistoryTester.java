/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import edu.hdsb.gwss.ics4u.u5.BrowserHistory;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author nwu10
 */
public class BrowserHistoryTester {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {

        String str = "https://gws.hdsb.ca/";
        char letter = 'A';
        URL[] url = new URL[20];

        for (int i = 0; i < 20; i++) {
            url[i] = new URL(str + letter);
            letter++;
        }

        BrowserHistory x = new BrowserHistory();

        //EMPTY
        assert (x.back() == null);
        assert (x.forward() == null);

        for (int i = 0; i < 3; i++) {
            x.visit(url[i]);
        }
        for (int i = 1; i >= 0; i--) {
            assert (x.back() == url[i]);
        }
        for (int i = 1; i < 3; i++) {
            assert (x.forward() == url[i]);
        }

        assert (x.back() == url[1]);
        assert (x.back() == url[0]);

        for (int i = 0; i < 4; i++) {
            x.visit(url[10 + i]);
        }
        for (int i = 0; i < 3; i++) {
            assert (x.back() == url[12 - i]);
        }
        for (int i = 0; i < 3; i++) {
            assert (x.forward() == url[11 + i]);
        }
    }
}
