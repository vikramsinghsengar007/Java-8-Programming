package com.interview;

import java.util.Arrays;
import java.util.List;

public class Altimetic2 {
    public static void main(String[] args) {
        int arr[] = {30,60,70,90,80,40,20,10,50};
        for(int i = 0; i< arr.length-1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 100)
                    System.out.println(arr[i] + " " + arr[j]);

            }
        }

    }
}
