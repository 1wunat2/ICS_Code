package edu.hdsb.gwss.muir.ics4u.u7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClassReaderExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // RANDOM ACCESS FILE
        RandomAccessFile raf = new RandomAccessFile("class_info.dat", "rw");

        // EMPTY CONTAINER
        ClassRecord c = new ClassRecord();

        // READ - TEACHER NAME
        char str[] = new char[ClassRecord.LENGTH_TEACHER];
        for (int i = 0; i < ClassRecord.LENGTH_TEACHER; i++) {
            str[i] = raf.readChar();
        }
        c.setTeacherName(new String(str));

        // READ - SUBJECT
        str = new char[ClassRecord.LENGTH_SUBJECT];
        for (int i = 0; i < ClassRecord.LENGTH_SUBJECT; i++) {
            str[i] = raf.readChar();
        }
        c.setSubject(new String(str));

        // READ - size
        c.setSize(raf.readInt());

        // FIRST RECORD
        System.out.println(c.toString());

        // EMPTY CONTAINER
        c = new ClassRecord();

        // READ - TEACHER NAME
        str = new char[ClassRecord.LENGTH_TEACHER];
        for (int i = 0; i < ClassRecord.LENGTH_TEACHER; i++) {
            str[i] = raf.readChar();
        }
        c.setTeacherName(new String(str));

        // READ - SUBJECT
        str = new char[ClassRecord.LENGTH_SUBJECT];
        for (int i = 0; i < ClassRecord.LENGTH_SUBJECT; i++) {
            str[i] = raf.readChar();
        }
        c.setSubject(new String(str));

        // READ - size
        c.setSize(raf.readInt());

        // FIRST RECORD
        System.out.println(c.toString());
    }

}
