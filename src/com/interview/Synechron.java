package com.interview;

public class Synechron {
    public static void main(String[] args) {
        Synechron synechron = new Synechron();
        System.out.println(synechron.solution(5));
        int[] a = new int[5];
m(a);
        System.out.println(a.length);

    }

    static void  m(int[] a){
        int[] b = new int [2];
        a= b;
        System.out.println(b.length);
        System.out.println(a.length);
    }

     int  solution(int N) {
       int total =0;
       for (int i=1; i<=N; i++) {
            String nStr= String.valueOf(i);
            total += nStr.split("1",-1).length -1;
       }
       return total;
    }
}
