package com.company;

public class Jack extends Bob implements Printable{
    private String clothes;

    public Jack(String clothes) {
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public void print() {
        System.out.println("вещи - " + getClothes());
        System.out.println("число - " + getNumber());
        System.out.println("стринг - " + getString());

    }
}
