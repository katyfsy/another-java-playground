package com.galvanize;

import java.util.ArrayList;
import java.util.List;

interface Animal {

}
class Person implements Animal {
    https://gitlab.com/katyfsy
}
public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());

        System.out.println(person instanceof Person);//return true
        System.out.println(person instanceof Object);//return true

        Object o = new Object();
        System.out.println(o instanceof Person);//return false

        System.out.println(person instanceof Animal);//return true

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list instanceof List);//return true
    }
}
