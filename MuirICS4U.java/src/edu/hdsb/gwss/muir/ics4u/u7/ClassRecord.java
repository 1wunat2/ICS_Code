/**
 * Class Record
 *
 * @author Wm.Muir
 * @version 2020-21.Q1
 */
package edu.hdsb.gwss.muir.ics4u.u7;

public class ClassRecord {

    public static final int RECORD_LENGTH = 58;
    public static final int LENGTH_TEACHER = 15;
    public static final int LENGTH_SUBJECT = 12;

    private String teacherName;
    private String subject;
    private int size;
    private int dbid;

    public ClassRecord() {
        this.dbid = -1;
    }

    public ClassRecord( int dbid ) {
        this.dbid = dbid;
    }

    public ClassRecord( String teacherName, String subject, int size ) {
        this.setTeacherName( teacherName );
        this.setSubject( subject );
        this.size = size;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName( String teacherName ) {
        StringBuilder temp = new StringBuilder();

        if( teacherName != null ) {
            temp.append( teacherName.trim() );
        } else {
            temp.append( "" );
        }

        // trucates or pads the string
        temp.setLength( LENGTH_TEACHER );
        this.teacherName = temp.toString();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject( String subject ) {
        StringBuilder temp = new StringBuilder();

        if( subject != null ) {
            temp.append( subject.trim() );
        } else {
            temp.append( "TBD" );
        }

        // trucates or pads the string
        temp.setLength( LENGTH_SUBJECT );
        this.subject = temp.toString();
    }

    public int getSize() {
        return size;
    }

    public void setSize( int size ) {
        this.size = size;
    }

    public int getDbid() {
        return dbid;
    }

    public void setDbid( int dbid ) {
        this.dbid = dbid;
    }
  
    @Override
    public String toString() {
        return "ClassRecord{" + "teacherName=" + teacherName
                + ", subject=" + subject
                + ", numberOfStudents=" + size + '}';
    }

}
