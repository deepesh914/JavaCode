package com.test.t3;

public class OperativeFindVowels {
    public static void main(String[] args) {
        String name = "rakesh";
        int count = name.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println(count);
    }
}
