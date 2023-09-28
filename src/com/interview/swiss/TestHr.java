package com.interview.swiss;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TestHr {
    public static void main(String[] args) {
        String words[] = {"t","s","g","f","z","Z","a"};
        //bigger char
        int count =0;
        TreeSet<Character> ts = new TreeSet<>();

        for(int i=0; i<words.length; i++) {
            ts.add(words[i].charAt(0));
        }
        List<Character> LIST = new ArrayList<>(ts);
        char ch = LIST.get(words.length-1);
        System.out.println(ch);
    }

}
