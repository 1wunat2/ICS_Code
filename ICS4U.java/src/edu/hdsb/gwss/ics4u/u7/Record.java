/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u7;

import java.util.Objects;

/**
 *
 * @author nwu10
 */
public class Record {

    //VARIABLES
    private String author, title;
    private int publishYear, volume;
    private long id;
    private boolean softCover;
    //0-900
    private double duiDecimal;
    //n = new, g = good, o = ok, b = bad
    private char condition;

    public static final int AUTHOR_LENGTH = 15;
    public static final int TITLE_LENGTH = 20;
    public static final int RECORD_LENGTH = 89;

    //CONSTRUCTORS
    public Record() {
        this.id = -1;
    }

    public Record(String author, String title, int year, int volume, boolean softCover, char condition, double duiDecimal) {
        this.setAuthor(author);
        this.setTitle(title);
        this.publishYear = year;
        this.volume = volume;
        this.softCover = softCover;
        this.condition = condition;
        this.duiDecimal = duiDecimal;
        this.id = -1;
    }

    public long getId() {
        return id;
    }

    public boolean isSoftCover() {
        return softCover;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getVolume() {
        return volume;
    }

    public double getDuiDecimal() {
        return duiDecimal;
    }

    public char getCondition() {
        return condition;
    }

    public void setAuthor(String author) {
        StringBuilder temp = new StringBuilder();

        if (author != null) {
            temp.append(author.trim());
        }

        temp.setLength(AUTHOR_LENGTH);
        this.author = temp.toString();
    }

    public void setTitle(String title) {
        StringBuilder temp = new StringBuilder();

        if (title != null) {
            temp.append(title.trim());
        }

        temp.setLength(TITLE_LENGTH);
        this.title = temp.toString();
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public void setSoftCover(boolean softCover) {
        this.softCover = softCover;
    }

    public void setDuiDecimal(double duiDecimal) {
        this.duiDecimal = duiDecimal;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Record other = (Record) obj;
        if (this.publishYear != other.publishYear) {
            return false;
        }
        if (this.volume != other.volume) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.softCover != other.softCover) {
            return false;
        }
        if (Double.doubleToLongBits(this.duiDecimal) != Double.doubleToLongBits(other.duiDecimal)) {
            return false;
        }
        if (this.condition != other.condition) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return Objects.equals(this.title, other.title);
    }

    @Override
    public String toString() {
        return "Record{" + "author=" + author
                + ", title=" + title
                + ", publishYear=" + publishYear
                + ", volume=" + volume
                + ", softCover=" + softCover
                + ", Condition=" + condition
                + ", duiDecimal=" + duiDecimal + '}';
    }

}
