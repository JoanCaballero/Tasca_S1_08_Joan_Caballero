package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> list = Arrays.asList("dilluns", 3125,"dimarts", "dijous", "juliol", 234532, "octubre", "desembre", "hola", 2);
        Comparator<Object> byLength = (o1, o2) -> {
            if (o1 instanceof String && o2 instanceof Integer) {
                return -1; // Strings should come before integers
            } else if (o1 instanceof Integer && o2 instanceof String) {
                return 1; // Integers should come after strings
            } else if (o1 instanceof String && o2 instanceof String) {
                if( (Integer.compare(((String) o1).length(), ((String) o2).length())) == 1){
                    return -1;
                } else if ((Integer.compare(((String) o1).length(), ((String) o2).length())) == -1) {
                    return 1;
                } else {return 0;}
            } else {
                return 0; // Objects are equal
            }
        };
        list.sort(byLength);
        System.out.println(list);
    }
}