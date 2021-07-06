package com.DS_StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditorHackerRank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<String>();
        int limit = sc.nextInt();
        String currentString = "";

        for (int i = 0; i <= limit; i++) {
            int a = sc.nextInt();
            switch (a) {
            case 1:
                st.push(currentString);
                String append = sc.next();
                currentString += append;
                break;
            case 2:
                st.push(currentString);
                int charLength = sc.nextInt();
                currentString = currentString.substring(0, currentString.length() - charLength);
                break;
            case 3:
                int index = sc.nextInt();
                System.out.println(currentString.charAt(index - 1));
                break;
            case 4:
                currentString = (String) st.pop();
                break;
            default:
                break;
            }
        }
    }
}