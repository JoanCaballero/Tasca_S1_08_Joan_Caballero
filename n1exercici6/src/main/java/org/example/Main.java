package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("dilluns", 3125,"dimarts", "dijous", "juliol", 234532, "octubre", "desembre", "hola", 2);
        List<String> listString = list.stream().filter(o -> o instanceof String).map(Object::toString).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(listString);
    }
}