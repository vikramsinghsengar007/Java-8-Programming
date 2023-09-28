package com.prepration;

import java.util.stream.IntStream;

public class Hello {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

       // String input = "player=dhoni,team=csk,price=1cr^player=kohli,team=blr,price=1cr^player=rahul,team=mum,price=1cr";


       /* Reverse the words in sentence without using String[] and other java api
        "HELLO ALL TODAY" -> "TODAY ALL HELLO"*/

        String rev = "HELLO ALL TODAY";
        char a[] = new char[rev.length()];
        int i, j;
        int index =0;
        int previous = a.length;
        for (i = a.length - 1; i >= 0; i--) {
            if (rev.charAt(i) == ' ' ) {
                for (j = i + 1; j < previous; j++) {
                    a[index] = rev.charAt(j);
                    index ++;
                }
                a[index++] = ' ';
                previous = i;
            }
        }
        for (j = 0; j < previous; j++) {
            a[index] = rev.charAt(j);
            index ++;
        }
        String n = new String(a);
        System.out.println(n);

        Runnable r = () -> {
            IntStream.rangeClosed(1,10).forEach(System.out::println);
        };
        Thread t = new Thread(r);
        t.start();

    }







}
