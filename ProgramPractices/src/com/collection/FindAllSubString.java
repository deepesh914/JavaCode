package com.collection;

import java.util.ArrayList;

public class FindAllSubString {

    public static void main(String[] args) {
        String a = "zyzyzyz";

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                if (i != j)
                    list.add(a.substring(i, j));
            }
        }
        System.out.println(list);
    }
}
