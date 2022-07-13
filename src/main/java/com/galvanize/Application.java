package com.galvanize;

public class Application {
    public static void main(String[] args) {
       Marker marker = new Marker();
       marker.unCap();
       marker.write("hello");
       marker.write("world");
       System.out.println(marker);

       Marker marker2 = new Marker();
       System.out.println(marker2);
    }
}
