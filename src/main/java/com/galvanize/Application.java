package com.galvanize;

import java.util.*;

public class Application {
    public static Integer RomanToDecimal(String string) {
        Hashtable<String, Integer> romanDict = new Hashtable<String, Integer>();

        romanDict.put("I", 1);
        romanDict.put("V", 5);
        romanDict.put("X", 10);
        romanDict.put("L", 50);
        romanDict.put("C", 100);
        romanDict.put("D", 500);
        romanDict.put("M", 1000);

        int decimal = 0;
        int index = 0;
        String[] romans = string.split("");

        while (index < romans.length - 1) {
            if (romanDict.get(romans[index]) < romanDict.get(romans[index + 1])) {
                decimal -= romanDict.get(romans[index]);
            } else {
                decimal += romanDict.get(romans[index]);
            }
            index ++;
        }

        decimal += romanDict.get(romans[index]);
        return decimal;
    }

    public static String FizzBuzz(String string) {
        int integer = Integer.parseInt(string);
        if (integer % 3 == 0 && integer % 5 == 0) {
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
        System.out.println(RomanToDecimal(args[0]));
    }
}
