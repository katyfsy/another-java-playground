package com.galvanize;

public class Application {
    public static void main(String[] args) {
       Marker marker = new Marker(false, 0.7f);
       marker.unCap();
       marker.write("hello");
       marker.write("world");
       System.out.println(marker);

       Marker marker2 = new Marker(true, 1f);
       System.out.println(marker2);
    }
}
