package com.test.t2;

import java.util.ArrayList;
import java.util.List;

public class SyncheronDemo {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = new String("abcd");
        System.out.println(s1.hashCode() == s2.hashCode());

        Integer count = 4;
        increment(count);
        System.out.println(count);

        List<Integer> countList = new ArrayList();
        countList.add(3);
        addIntSix(countList);
        System.out.println(countList.toString());
    }

    private static void addIntSix(List<Integer> countList) {
        countList.add(6);

    }

    private static void increment(Integer count) {
        count = count + 2;

    }

}
