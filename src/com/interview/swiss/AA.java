package com.interview.swiss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AA {
    public static void main(String[] args) {
        String arr[] = {"vikram", "java"};

        List<String> list = Arrays.asList(arr);
        List<String> finalList = list.stream()
                .map(str -> str.replaceFirst(str.substring(1, 2), str.substring(1, 2).toUpperCase())).collect(Collectors.toList());
        System.out.println(finalList);

        CustomerFunctional customerFunctional = (a, b) -> a+b;
        System.out.println(customerFunctional.add(2,4));
        customerFunctional.show();
        System.out.println(customerFunctional.square(2));
    }
}

