package com.hackerrank;

import java.util.*;

public class findMaxAndMinFromList {


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        int min =0, max=0;
        List<Integer> total = new ArrayList<>();
        List<Integer> arrb= new ArrayList<>(arr);
        for (int i=0; i< arr.size(); i++) {
            total.add(arr.stream().mapToInt(v -> v).sum());
            arr.remove(i);
        }
        for (int i= arrb.size(); i>1; i--) {
            total.add(arrb.stream().mapToInt(v -> v).sum());
            arrb.remove(i);
        }
        System.out.println(total);
    }
}
