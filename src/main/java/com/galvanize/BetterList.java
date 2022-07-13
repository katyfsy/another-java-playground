package com.galvanize;

import java.util.List;
import java.util.stream.Collectors;

public class BetterList {
    private final List<String> items;

    BetterList(List<String> items) {
        this.items = items;
    }

    public String join(String delimiter, long limit) {
        return items.stream().limit(limit).collect(Collectors.joining(delimiter));
    }

}
