package com.prepration;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int arr[] = {6,1,5,3,2,4};
        int[] ints = removeElementFromArray(arr, 3);
        Arrays.stream(ints).boxed().forEach(System.out::println);
    }

    private static int[] removeElementFromArray(int[] arr, int element) {
        int[] result = new int[arr.length-1];
        for (int i = 0; i < result.length; i++){
            if(arr[i] == element){
                result[i] = arr[i+1];
                arr[i+1] = 0;
            }else{
                result[i] = arr[i];
            }
        }

        return result;
    }
}
