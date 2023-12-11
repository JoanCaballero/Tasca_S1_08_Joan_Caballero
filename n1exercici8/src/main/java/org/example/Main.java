package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface fI = (s) -> {
            char[] sArray = s.toCharArray();
            for (int i = 0; i < sArray.length / 2; i++) {
                char temp = sArray[i];
                sArray[i] = sArray[sArray.length - 1 - i];
                sArray[sArray.length - 1 - i] = temp;
            }
            return new String(sArray);

        };
        String str = "IT Academy";
        String strReversed = fI.reverse(str);
        System.out.println(str);
        System.out.println(strReversed);
    }


}