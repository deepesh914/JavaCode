package com.test.t2;

public class HackerEarth1 {

    public static void main(String[] args) {

        Language p = new Language();
        p.name = "E.java";
        Funct1(p);
        System.out.println(p.name);
        Funct2(p);
        System.out.println(p.name);
    }

    private static void Funct2(Language p) {
        p.name = "Python";
        System.out.println(p.name);

    }

    private static void Funct1(Language p) {

        p = new Language();
        p.name = "Angular";
        System.out.println(p.name);

    }

}


class Language {
    public String name;
}