package com.galvanize;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
      BetterList list = new BetterList(Arrays.asList("eliza", "angelica", "alexander"));
      System.out.println(list.join(",", 2));

      BetterList list2 = new BetterList(Arrays.asList("eliza"));
      System.out.println(list2.join(",", 2));

    }
}
