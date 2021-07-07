package com.test.t1;

import java.util.Scanner;

public class HackersRank {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String length = s.nextLine(); // Reading input from STDIN
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(length); i++) {
            sb.append(s.next());
        }
        s.close();
        System.out.println(sb.toString());

    }

}
