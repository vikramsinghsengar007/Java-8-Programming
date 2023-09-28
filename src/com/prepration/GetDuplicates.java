package com.prepration;

import java.util.Arrays;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    import java.util.stream.Collectors;

   /*How to find duplicate elements in a given integers list in java using Stream functions?*/
    public class GetDuplicates {
        public static void main(String[] args) {
            Integer arr[] = {10,15,8,49,25,98,98,32,15};
            System.out.println(getDuplicates(arr));

        }
        public static Set<Integer> getDuplicates(Integer[] numArr){
             List<Integer> numList = Arrays.asList(numArr);
             Set<Integer> set = new HashSet<>(numArr.length);
             return numList.stream()
                     .filter(n -> !set.add(n))
                     .collect(Collectors.toSet());
        }
    }
