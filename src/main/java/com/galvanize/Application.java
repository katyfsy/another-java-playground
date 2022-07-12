package com.galvanize;

public class Application {

    public static String FizzBuzz(String string) {
        int integer = Integer.parseInt(string);
        if (integer % 3 == 0 & integer % 5 == 0) {
            return "FizzBuzz";
        } else if (integer % 3 == 0) {
            return "Fizz";
        } else if (integer % 5 == 0) {
            return "Buzz";
        } else {
            return string;
        }
    }
    public static void main(String[] args) {
        System.out.println(FizzBuzz(args[0]));
    }
}
