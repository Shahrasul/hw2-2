package com.company;

public class Leo extends Bob implements Printable{
    private int year;

    public Leo(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("год - " + getYear());
        System.out.println("число - " + getNumber());
        System.out.println("стринг - " + getString());

    }
}
