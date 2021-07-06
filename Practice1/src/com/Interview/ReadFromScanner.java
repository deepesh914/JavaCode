package com.Interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadFromScanner {
    // Read multi-line input from console in Java using BufferedReader class
    public static void main(String[] args) {

        String[] tokens;
        try (InputStreamReader in = new InputStreamReader(System.in); BufferedReader buffer = new BufferedReader(in)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                tokens = line.split("\\s");
                System.out.println(Arrays.toString(tokens));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); String line; try { while ((line = br.readLine()) != null) {
 * String[] tokens = line.split("\\s"); System.out.println(Arrays.toString(tokens)); } br.close();
 */
