package com.galvanize;

 class Person {
    private String lastName;
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.setLastName("Other");
        System.out.println(person);
    }
}