package com.test.t2;

public class StringCheck {
    public static void main(String[] args) {
        String name = "Digit";

        String name1 = "Digit";

        String name2 = new String("Digit");

        String name3 = new String("Digit");

        System.out.println(name.equals(name1)); // true

        System.out.println(name == name1); // true

        System.out.println(name1 == name2); // false

        System.out.println(name1.equals(name2)); // true

        System.out.println(name2 == name3); // false

        System.out.println(name2.equals(name3)); // true
        System.out.println(name1.hashCode() == (name3.hashCode())); // true
    }

}
