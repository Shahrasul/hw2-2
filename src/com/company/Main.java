package com.company;

public class Main {

    public static void main(String[] args) {
        Jack jack = (Jack) createObjects("Jack");
        Leo leo = (Leo)createObjects("Leo");
        John john = (John)createObjects("John");
        jack.print();
        leo.print();
        john.print();

    }
    public static Bob createObjects(String className){
        Bob object = new Bob();
        switch (className) {
            case "Jack" -> {
                object = new Jack("Jacket");
                object.setNumber(7);
                object.setString("gol");
            }
            case "Leo" -> {
                object = new Leo(1957);
                object.setNumber(3);
                object.setString("slovo");
            }
            case "John" -> {
                object = new John("Lagman");
                object.setNumber(9);
                object.setString("word");
            }
        }
        return object;
    }

}
