package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("dilluns", "dimarts", "dijous", "juliol", "octubre", "desembre", "hola");
        ArrayList<String> arrayList = new ArrayList<>();
        list.forEach((l) -> {
            if (l.contains("o")) {
                arrayList.add(l);
            }
        });
        System.out.println(arrayList);
    }
}