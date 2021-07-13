package com.String;

public enum Singleton {

    INSTANCE;

    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
