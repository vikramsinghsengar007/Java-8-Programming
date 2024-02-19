package com.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(birthdayCakeCandles(list));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        return candles.stream()
                .collect(Collectors.groupingBy(i->i, Collectors.counting()))
                .values()
                .stream()
                .max(Comparator.comparingLong(i->i)).get().intValue();
    }

}
