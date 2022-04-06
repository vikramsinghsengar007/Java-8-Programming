package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNonRepeatingElements {
    public static void main(String[] args) {
        int[] nums = {49, 8, 25, 10, 98, 25, 98};
        List<int[]> numsList = Arrays.asList(nums);
        numsList.stream().distinct().collect(Collectors.toList());

    }

}
