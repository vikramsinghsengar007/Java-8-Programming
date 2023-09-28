package com.prepration;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* sort all the values present in it using Stream functions */
 public class SortElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(sortedArray(myList));
        System.out.println(reverseSortedArray(myList));

    }

    public static List<Integer> sortedArray(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> reverseSortedArray(List<Integer> list) {
        return list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
}
