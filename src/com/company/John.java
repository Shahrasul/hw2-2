package com.company;

public class John extends Bob implements Printable{
    private String food;

    public John(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void print() {
        System.out.println("еда - " + food);
        System.out.println("число - " + getNumber());
        System.out.println("стринг - " + getString());

    }
}
