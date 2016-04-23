package com.vinay.javatrains.rest;

/**
 * Created by Vinay on 05-04-2016.
 */
public class MyDate {

    private int date;
    private int month;
    private int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("MyDate [date=%d, month=%d, year=%d]", date, month, year);
    }
}
