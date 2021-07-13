package com.String;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton d = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {

        if (d == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (d == null) {
                    d = new DoubleCheckSingleton();
                }
            }
        }

        return d;
    }

}
