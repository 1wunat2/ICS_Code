/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u7;

/**
 *
 * @author nwu10
 */
public class DBTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DATA TO STORE
        Record[] r = new Record[6];
        r[0] = new Record("Jamie", "Me, Myself and I", 1808, 3, true, 'n', 0.001);
        r[1] = new Record("Isaac", "Life of 180 degrees", 1999, 1, false, 'g', 1.2);
        r[2] = new Record("Muir", "Death", 2020, 2, false, 'b', 20.45);
        r[3] = new Record("Nathan", "Failure That I Am", 2003, 5, true, 'n', 84.6);
        r[4] = new Record();
        r[5] = new Record("", null, 1, -1, true, 'r', 1002);

        //GETTING STARTING SPOT
        BookDB.open();
        long start = BookDB.getLastId();
        BookDB.close();

        //TESTING
        //ADD WHILE CLOSED
        assert (BookDB.save(r[0]) == null);

        //OPEN
        BookDB.open();

        //SAVE INVALID DATA
        BookDB.save(r[4]);
        assert (BookDB.get(start + 1) == null);
        BookDB.save(r[5]);
        assert (BookDB.get(start + 4) == null);

        //SAVE VALID DATA AND GET USING ID
        assert (BookDB.save(r[0]).equals(r[0]));
        assert (BookDB.get(start + 1).equals(r[0]));
        BookDB.save(r[1]);
        assert (BookDB.get(start + 2).equals(r[1]));
        BookDB.save(r[2]);
        assert (BookDB.get(start + 3).equals(r[2]));
        BookDB.save(r[3]);
        assert (BookDB.get(start + 4).equals(r[3]));

        //CLOSE
        BookDB.close();

        //ADD WHILE CLOSED
        assert (BookDB.save(r[0]) == null);

        BookDB.open();

        //EDIT DATA
        r[2].setAuthor("Capn Crunch");
        r[2].setTitle("Sup Dog");
        r[2].setPublishYear(1208);
        r[2].setVolume(5);
        r[2].setCondition('n');
        r[2].setSoftCover(true);
        r[2].setDuiDecimal(1.34);
        assert (BookDB.save(r[2]).equals(r[2]));
        assert (BookDB.get(start + 3).equals(r[2]));

        //SECONDARY KEY
        if (start == 0) {
            assert (BookDB.get("Jamie", "Me, Myself and I", 1808, 3, true, 'n').equals(r[0]));
            assert (BookDB.get("Capn Crunch", "Sup Dog", 1208, 5, true, 'n').equals(r[2]));
        }
        //GET A NON EXISTANT DATA
        assert (BookDB.get("Muir", "Death", 2020, 2, false, 'b') == null);

        //invalid id, SK INVALID DATA
        //IVALID GETS
        assert (BookDB.get(0) == null);
        assert (BookDB.get(-1) == null);
        assert (BookDB.get(BookDB.getLastId() + 5) == null);
        assert (BookDB.get("", "", 2020, -1, false, 'u') == null);
        assert (BookDB.get("Capn Crunch", null, 2020, 2, false, 'b') == null);

        BookDB.close();
    }

}
