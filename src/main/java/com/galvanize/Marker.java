package com.galvanize;

public class Marker {
    @Override
    public String toString() {
        return "Marker{" +
                "isCapped=" + isCapped +
                ", inkLevel=" + inkLevel +
                '}';
    }

    private boolean isCapped = true;
    private float inkLevel = 1.0f;

    void write(String letters) {
        inkLevel -= letters.length() * 0.05f;
    }

    void cap() {
        isCapped = true;
    }

    void unCap() {
        isCapped = false;
    }


}
