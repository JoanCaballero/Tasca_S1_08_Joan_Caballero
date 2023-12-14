package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface fI = (s) -> {
            StringBuilder strReverser = new StringBuilder(s);
            strReverser.reverse();
            return strReverser.toString();
        };
        String str = "IT Academy";
        String strReversed = fI.reverse(str);
        System.out.println(str);
        System.out.println(strReversed);
    }


}