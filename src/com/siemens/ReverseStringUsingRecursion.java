package com.siemens;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        System.out.println(reverseStringUsingRecursion("hello".toCharArray(),0));
    }

    public static String reverseStringUsingRecursion(char[] ch, int n){
        int length = ch.length;
        char temp = ch[n];
        int i = length- n-1;
        ch[n] = ch[i];
        ch[i] = temp;


        return  reverseStringUsingRecursion(ch, i+1);
    }
}
