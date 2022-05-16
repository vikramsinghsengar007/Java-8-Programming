package com.interview;

public class TestClass {
    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o) {
        System.out.println("Object method Invoked");
    }
    public static void test(String s) {
        System.out.println("String method Invoked");
    }
}
