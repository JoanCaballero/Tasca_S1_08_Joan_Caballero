package org.example;

public class Main {
    public static void main(String[] args) {
        InterfacePi iP = () -> 3.1415;
        System.out.println(iP.getPiValue());
    }
}