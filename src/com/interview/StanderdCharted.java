package com.interview;

public class StanderdCharted {
    public static void main(String[] args) {
        String s1 = "abcd##ef";
        String s2 = "abcp##efg#";
        System.out.println(removeHash(s1).equalsIgnoreCase(removeHash(s2)));


    }

    public static String removeHash(String word) {
        String finalWord = "";

        char ch[] = word.toCharArray();
        int length = word.length();
        int i = 0;
        while (length != 0) {
            if (ch[i] != '#') {
                finalWord += ch[i];
            } else {
                finalWord = finalWord.substring(0, finalWord.length() - 1);
            }
            i++;
            length--;
        }

        return finalWord;
    }
}
