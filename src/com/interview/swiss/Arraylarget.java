package com.interview.swiss;

import java.util.ArrayList;
import java.util.List;

public class Arraylarget {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,9,3,4,11,5,99};

        //sum = k
        int k = 10;
        int n = arr.length;
        for(int i =0; i< arr.length-1; i++){
            for(int j =i; j< arr.length; j++){
                if(arr[i]+ arr[j] == k){
                    System.out.println(arr[i]+" ,"+arr[j]);
                }
            }
        }
    }
}
