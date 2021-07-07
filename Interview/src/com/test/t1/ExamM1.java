package com.test.t1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ExamM1 {

    int val = 10;

    public static void main(String[] args) throws Exception {

        ExamM1 m = new ExamM1();
        System.out.println(m.val);
        // try {
        // System.out.println("Hi");
        // throw new RuntimeException();
        // } finally {
        // System.out.println("Hi11");
        // }

        try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {
            System.out.println("Hello");
            System.out.println("Hello");
            throw new RuntimeException();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }

        // System.out.println(Class.forName("String").getName());

    }

}
