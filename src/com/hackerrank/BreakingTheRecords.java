package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BreakingTheRecords {


    public static void main(String[] args) {
        int scoreArr[] = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        List<Integer> scores = Arrays.stream(scoreArr).boxed().collect(Collectors.toList());
        System.out.println(breakingRecords(scores));

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0), max=scores.get(0);
        int countMax=0, countMin=0;
        List<Integer> records = new ArrayList<>();

        for(int i=0; i< scores.size(); i++){

            if(scores.get(i) > max){
                max = scores.get(i).intValue();
                countMax++;
            }

            if(scores.get(i) < min){
                min = scores.get(i).intValue();
                countMin++;
            }
        }
        records.add(countMax);
        records.add(countMin);
        return records;
    }
}
