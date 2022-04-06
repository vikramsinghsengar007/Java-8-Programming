package com.interview;

public class Altimetric1 {
    public static void main(String[] args) {
        long input = 796453182;

        getSumOfEven(input);
        getSumOfOdd(input);

    }

    private static void getSumOfEven(long input) {
        int sumEven=0;
        int number=1;
        while(input !=0){
            if(number%2 ==0){
                sumEven  += input %10;
            }
            input /= 10;
            number++;

        }
        System.out.println(sumEven);
    }

    private static void getSumOfOdd(long input) {
        int sumOdd=0;
        int number=1;
        while(input !=0){
            if(number%2 !=0){
                sumOdd  += input %10;
            }
            input /= 10;
            number++;

        }
        System.out.println(sumOdd);
    }
}
