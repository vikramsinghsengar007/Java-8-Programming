package com.interview;

public class JPMorgan {
    public static void main(String[] args) {
        String s= "ghabjacdbad", newS="";
        String arr[] = {"ab", "cd", "ba", "dc"};

        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.contains(arr[n])){
                newS += s.substring(i, i+2);
                i = i+2;
            }
        }
        System.out.println(s.replaceAll("ab|ba|cd|dc", ""));
    }
}
