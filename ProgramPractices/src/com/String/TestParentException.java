package com.String;

public class TestParentException extends ParentException {

    public static void main(String[] args) {
        TestParentException tpe = new TestParentException();
        tpe.get();

    }

    @Override
    public void get() throws ArithmeticException {
        int i = 10 / 0;
        System.out.println("Child");
    }
}


class ParentException {

    public void get() {
        System.out.println("Parent");
    }
}