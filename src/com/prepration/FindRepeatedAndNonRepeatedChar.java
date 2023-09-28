package com.prepration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Given a String, find the first non-repeated and repeated character in it using Stream functions?*/
 public class FindRepeatedAndNonRepeatedChar {
     public static void main(String[] args) {
         String word = "java is awesome jar";
         System.out.println(firstNonRepeatedChar(word));
         System.out.println(firstRepeatedChar(word));

     }
         public static String firstNonRepeatedChar(String word){
          Map<Character, Long> map =  word.chars().mapToObj(s -> (char)s)
                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
             Character findNonRepeatedChar = map.entrySet().stream()
                     .filter(characterLongEntry -> characterLongEntry.getValue() ==1)
                     .map(characterLongEntry -> characterLongEntry.getKey()).findFirst().orElse(null);
             return findNonRepeatedChar.toString();
     }

    public static Character firstRepeatedChar(String word){
        Map<Character, Long> map = word.chars().mapToObj(s -> (char)s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Character findNonRepeatedChar = map.entrySet().stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() >1)
                .map(characterLongEntry -> characterLongEntry.getKey())
                .findFirst()
                .orElse(null);
        return findNonRepeatedChar;
    }
 }
