package com.prepration;

import java.util.Arrays;
import java.util.Comparator;

/*Given a list of integers, find the maximum and minimum value element present in it using Stream functions?*/
 public class FindMaxAndMinElem {
     public static void main(String[] args) {
         Integer arr[] = {10,15,8,49,25,98,98,32,15};
         System.out.println(findMax(arr));
         System.out.println(findMin(arr));

     }
     public static Integer findMax(Integer[] numArr){
          return Arrays.stream(numArr).max(Integer::compare).orElse(null);
     }
    public static Integer findMin(Integer[] numArr){
        return Arrays.stream(numArr).min(Integer::compare).orElse(null);
    }
 }
