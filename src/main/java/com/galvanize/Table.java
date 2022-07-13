package com.galvanize;

public class Table {

    public String getShape() {
        return shape;
    }
    @Override
    public String toString() {
        return "Table{" + "shape='" + shape + '\'' + '}';
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    private String shape;
}
