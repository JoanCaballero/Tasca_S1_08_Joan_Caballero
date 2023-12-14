package org.example;

import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<?> list = Arrays.asList("dilluns", 3125,"dimarts", "dijous", "juliol", 234532, "octubre", "desembre", "hola", 2);
        List<String> listString = list.stream().filter(o -> o instanceof String).map(Object::toString).sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(listString);
    }
}