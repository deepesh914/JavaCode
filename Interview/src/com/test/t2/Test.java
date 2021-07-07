package com.test.t2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        C c = new D();
        try {
            c.m1();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class C {
    void m1() throws IOException {
        System.out.println("C-M1");
    }

    // void m1() throws SQLException {
    // System.out.println("C-M1");
    // }
}


class D extends C {
    void m1() throws FileNotFoundException {
        System.out.println("D-M1");
    }

    // void m1() throws Exception {
    // System.out.println("D-M1");
    // }
}