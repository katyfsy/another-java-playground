package com.galvanize;

public class Application {
    public static void main(String[] args) {
       Table roundTable = new Table();
       roundTable.setShape("round");

       Table squareTable = new Table();
       squareTable.setShape("square");
       System.out.println(roundTable);
       System.out.println(squareTable);
    }
}
