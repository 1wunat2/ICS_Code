/**
 * Class Record
 *
 * @author Wm.Muir
 * @version 2020-21.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u7;

import java.io.RandomAccessFile;

public class ClassWriterExample {

    public static void main( String[] args ) throws Exception {

        System.out.println( "Creating 4 Class Records" );
        ClassRecord c1 = new ClassRecord( "Mr. Sanderson", "Chemistry", 31 );
        ClassRecord c2 = new ClassRecord( "Ms. Smallbone", "Biology", 32 );
        ClassRecord c3 = new ClassRecord( "Dr. Jay", "Physics", 34 );
        ClassRecord c4 = new ClassRecord( "Mr. Muir", "Computer Science", 20 );
        System.out.println( "*********************" );

        // RANDOM ACCESS FILE
        RandomAccessFile raf = new RandomAccessFile( "class_info.dat", "rw" );

        // MOVE TO THE START OF THE FILE; OVER-WRITE EVERYTHING
        
        raf.seek( raf.length() );

        // WRITE CLASS #1
        raf.writeChars( c1.getTeacherName() );
        raf.writeChars( c1.getSubject() );
        raf.writeInt( c1.getSize() );
        System.out.println( "LENGTH: " + raf.length() );

        // WRITE CLASS #2
        raf.writeChars( c2.getTeacherName() );
        raf.writeChars( c2.getSubject() );
        raf.writeInt( c2.getSize() );
        System.out.println( "LENGTH: " + raf.length() );

        // WRITE CLASS #3
        raf.writeChars( c3.getTeacherName() );
        raf.writeChars( c3.getSubject() );
        raf.writeInt( c3.getSize() );
        System.out.println( "LENGTH: " + raf.length() );

        // WRITE CLASS #4
        raf.writeChars( c4.getTeacherName() );
        raf.writeChars( c4.getSubject() );
        raf.writeInt( c4.getSize() );
        System.out.println( "LENGTH: " + raf.length() );
        System.out.println( c4.toString() );
    }

}
