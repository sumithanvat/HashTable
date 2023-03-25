package com.bridgelabz;

public class MyMapNode {
    private final String key;
    private int value;

    // Constructor
    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }

    // Getter and setter methods
    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}