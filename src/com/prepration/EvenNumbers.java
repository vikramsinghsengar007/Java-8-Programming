package com.prepration;

import sun.security.provider.Sun;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Given a list of integers, find out all the even numbers exist in the list using Stream functions?*/
public class EvenNumbers {
    public static void main(String[] args) {
        Integer arr[] = {10,15,8,49,25,98,32, 15, 10};
        System.out.println(getEvens(arr));

        int n = 10;
        isEvenNumber(n);
        System.out.println(findNumberStartWith1(arr));
        System.out.println(findDuplicates(arr));
        System.out.println(findFirstElement(arr));
        System.out.println(SunOfAllElements(arr));

    }

    private static void isEvenNumber(int n) {
        Optional<Integer> m = Stream.of(n).filter(h -> n %10 ==0).findAny();
        System.out.println(m.isPresent());
    }

    public static List<Integer> getEvens(Integer[] numArr){
         List<Integer> numList = Arrays.asList(numArr);
         return numList.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
    }

    public static List<Integer> findNumberStartWith1(Integer[] numArr){
        return Arrays.stream(numArr).map(num -> num+ "").filter(str -> str.startsWith("1"))
                .map(Integer::valueOf).collect(Collectors.toList());
    }

    public static List<Integer> findDuplicates(Integer[] numArr){
        Set<Integer> set = new LinkedHashSet<>();
        return Arrays.stream(numArr).filter(num -> !set.add(num)).collect(Collectors.toList());
    }

    public static Integer findFirstElement(Integer[] numArr) {
        return Arrays.stream(numArr).findFirst().get();
    }
    public static long SunOfAllElements(Integer[] numArr) {
        return Arrays.stream(numArr).mapToLong(Integer::longValue).sum();
    }
}
