package com.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr = Arrays.stream(ar).boxed().collect(Collectors.toList());
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> typesToCountMap = arr.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long maxCount = typesToCountMap.values().stream().
                max(Comparator.naturalOrder()).
                get();

        List<Integer> typeWithMaxCount = typesToCountMap.entrySet().stream().
                filter(item -> Objects.equals(item.getValue(), maxCount)).
                map(Map.Entry::getKey).
                collect(Collectors.toList());
        return typeWithMaxCount.stream().findFirst().get().intValue();
    }
}
