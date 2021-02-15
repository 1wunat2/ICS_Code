package edu.hdsb.gwss.muir.ics4u.u7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClassUpdaterExample {

    public static void main( String[] args ) throws FileNotFoundException, IOException {

        // RANDOM ACCESS FILE
        RandomAccessFile raf = new RandomAccessFile( "class_info.dat", "rw" );

        // READ Record #2
        int recordID = 2;
        raf.seek( ( recordID - 1 ) * ClassRecord.RECORD_LENGTH );

        // FILL RECORD
        ClassRecord c = new ClassRecord( recordID );

        // READ - TEACHER NAME
        char str[] = new char[ClassRecord.LENGTH_TEACHER];
        for( int i = 0; i < ClassRecord.LENGTH_TEACHER; i++ ) {
            str[i] = raf.readChar();
        }
        c.setTeacherName( new String( str ) );

        // READ - SUBJECT
        str = new char[ClassRecord.LENGTH_SUBJECT];
        for( int i = 0; i < ClassRecord.LENGTH_SUBJECT; i++ ) {
            str[i] = raf.readChar();
        }
        c.setSubject( new String( str ) );

        // READ - size
        c.setSize( raf.readInt() );

        // BEFORE
        System.out.println( "BEFORE: " );
        System.out.println( c.toString() );

        // UPDATE
        c.setSubject( "BIOLOGY 4U" );
        c.setSize( c.getSize() + 2 );

        // WRITE RECORD
        raf.seek( ( recordID - 1 ) * ClassRecord.RECORD_LENGTH );
        
        // RE-WRITE CLASS #1
        System.out.println( "AFTER: " );
        raf.writeChars( c.getTeacherName() );
        raf.writeChars( c.getSubject() );
        raf.writeInt( c.getSize() );
        System.out.println( c.toString() );

    }

}
