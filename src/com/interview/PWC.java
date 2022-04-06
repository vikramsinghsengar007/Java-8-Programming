package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PWC {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);

            System.out.println(isPrime(100));


    }

    public static List<Integer> isPrime(int num){
        return
                IntStream
                        .range(2,num)
                        .filter(number -> IntStream.range(2,number)
                                .noneMatch(divider -> number % divider == 0))
                        .boxed()
                        .collect(Collectors.toList());
    }
}
