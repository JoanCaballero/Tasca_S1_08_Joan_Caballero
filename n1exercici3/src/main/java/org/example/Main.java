package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mesos = Arrays.asList("gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "semptembre", "octubre", "novembre", "desembre");
        mesos.forEach((m)-> System.out.println(m));
    }
}