package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Wipro {
    public static void main(String[] args) {
        int numbers[] = {1,2,5,7,9,10,15,20};
        int myNumber = 17;
        int distance = Math.abs(numbers[0] - myNumber);
        int idx = 0;
        for(int c = 1; c < numbers.length; c++){
            int cdistance = Math.abs(numbers[c] - myNumber);
            if(cdistance < distance){
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = numbers[idx];

        System.out.println(theNumber);

    }
}
