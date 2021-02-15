/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author nwu10
 */
public class BookDB {

    private static RandomAccessFile db;
    private static boolean isOpen = false;

    public static void open() {
        //TRY TO OPEN THE FILE
        try {
            db = new RandomAccessFile("book_db.dat", "rw");
            isOpen = true;
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file.");
        }
    }

    public static void close() {
        //TRY TO CLOSE THE DB
        try {
            db.close();
            isOpen = false;
        } catch (IOException e) {
            System.out.println("Cannot close file");
        }
    }

    public static Record save(Record r) {
        if (!isOpen) {
            System.out.println("File not open");
        } else {
            if (isValid(r)) {
                try {
                    //WHERE DO YOU WRITE IN THE FILE
                    if (r.getId() == -1) {
//                    System.out.println(db.length());
                        db.seek(db.length());
                        r.setId(db.length() / Record.RECORD_LENGTH + 1);
                    } else {
//                    System.out.println((r.getId() - 1) * Record.RECORD_LENGTH);
                        db.seek((r.getId() - 1) * Record.RECORD_LENGTH);

                    }
                    //author, title, year, volume, softcover, condition, duidecimal
                    //WRITE DATA
                    db.writeChars(r.getAuthor());
                    db.writeChars(r.getTitle());
                    db.writeInt(r.getPublishYear());
                    db.writeInt(r.getVolume());
                    db.writeBoolean(r.isSoftCover());
                    db.writeChar(r.getCondition());
                    db.writeDouble(r.getDuiDecimal());

                    //RETURN
                    return r;
                } catch (IOException e) {
                    System.out.println("Cannot save");
                }
            }
        }
        return null;
    }

    public static Record get(long id) {
        if (isOpen) {
            //NEW RECORD
            Record r = new Record();

            //ATTEMPTS TO FIND THE ID IN THE FILE
            try {
//                System.out.println(Record.RECORD_LENGTH * (id - 1));
                db.seek(Record.RECORD_LENGTH * (id - 1));

                //author, title, year, volume, softcover, condition, duidecimal
                //READ AUTHOR
                char str[] = new char[Record.AUTHOR_LENGTH];
                for (int i = 0; i < Record.AUTHOR_LENGTH; i++) {
                    str[i] = db.readChar();
                }
                r.setAuthor(new String(str));

                //READ TITLE
                str = new char[Record.TITLE_LENGTH];
                for (int i = 0; i < Record.TITLE_LENGTH; i++) {
                    str[i] = db.readChar();
                }
                r.setTitle(new String(str));

                //READ YEAR PUBLISHED
                r.setPublishYear(db.readInt());

                //READ VOLUME
                r.setVolume(db.readInt());

                //READ SOFT COVER
                r.setSoftCover(db.readBoolean());

                //READ CONDITION
                r.setCondition(db.readChar());

                //READ DUIDECIMAL
                r.setDuiDecimal(db.readDouble());

                //SET ID
                r.setId(id);
                return r;
            } catch (IOException e) {
                //ERROR MESSAGE
                System.out.println("Could not complete action");
            }
        }
        System.out.println("File not open");
        return null;
    }

    public static Record get(String author, String title, int year, int volume, boolean softCover, char condition) {
        if (!isOpen) {
            System.out.println("File not open");
        } else {
            //VARIABLES
            long counter = 0;
            Record r = new Record();

            //FORMAT PASSED DATA
            Record data = new Record();
            data.setAuthor(author);
            data.setTitle(title);

            try {
                //author, title, year, volume, softcover, condition, duidecimal
                //LOOP THROUGH DATA BASE
                while (counter * Record.RECORD_LENGTH < db.length()) {
                    //SEEK
                    db.seek(counter * Record.RECORD_LENGTH);

                    //GET AUTHOR
                    char str[] = new char[Record.AUTHOR_LENGTH];
                    for (int i = 0; i < Record.AUTHOR_LENGTH; i++) {
                        str[i] = db.readChar();
                    }
                    r.setAuthor(new String(str));

                    //CHECK IF SAME AUTHOR
                    if (data.getAuthor().equalsIgnoreCase(r.getAuthor())) {

                        //GET TITLE
                        str = new char[Record.TITLE_LENGTH];
                        for (int i = 0; i < Record.TITLE_LENGTH; i++) {
                            str[i] = db.readChar();
                        }
                        r.setTitle(new String(str));

                        //CHECK IF SAME TITLE
                        if (data.getTitle().equalsIgnoreCase(r.getTitle())) {
                            //GET PUBLISH YEAR
                            r.setPublishYear(db.readInt());

                            //CHECK IF SAME YEAR
                            if (year == r.getPublishYear()) {
                                //GET VOLUME
                                r.setVolume(db.readInt());

                                //CHECK IF SAME VOLUME
                                if (volume == r.getVolume()) {
                                    //GET SOFT COVER
                                    r.setSoftCover(db.readBoolean());

                                    //CHECK IF SAME SOFT COVER
                                    if (softCover == r.isSoftCover()) {
                                        //BOOK IS FOUND STORE THE REST OF THE DATA
                                        r.setCondition(db.readChar());

                                        if (r.getCondition() == condition) {
                                            r.setDuiDecimal(db.readDouble());
                                            r.setId(counter + 1);

                                            //RETURN
                                            return r;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    //INCREASE COUNTER TO GO TO NEXT RECORD
                    counter++;
                }
            } catch (IOException e) {
                System.out.println("Could not complete action");
            }
        }
        //RETURN
        return null;
    }

    private static boolean isValid(Record r) {
        if (r.getAuthor() == null || r.getAuthor().equals("")) {
            return false;
        }
        if (r.getTitle() == null || r.getTitle().equals("")) {
            return false;
        }
        if (r.getVolume() < 1) {
            return false;
        }
        if (r.getCondition() != 'n' && r.getCondition() != 'g' && r.getCondition() != 'o' && r.getCondition() != 'b') {
            return false;
        }
        return !(r.getDuiDecimal() < 0 || r.getDuiDecimal() > 900);
    }

    public static long getLastId() {
        //GETS HOW MANY ENTRIES ARE ALREADY IN THE FILE
        try {
            return db.length() / Record.RECORD_LENGTH;
        } catch (IOException e) {
            System.out.println("ERROR");
            return 0;
        }
    }
}
