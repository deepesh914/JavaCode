package com.String;

import java.io.IOException;

public class TestParentException extends ParentException {

    public static void main(String[] args) {
        TestParentException tpe = new TestParentException();
        tpe.get();

    }

    public void get() {
        System.out.println("Child");
    }
}


class ParentException {

    public void get() throws IOException {
        System.out.println("Parent");
    }
}