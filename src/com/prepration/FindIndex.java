package com.prepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndex {
    public static void main(String[] args) {
        int array[] = {2,3,4,1,6,9};
        int target = 9;
        System.out.println(getIndex(array, target));
    }

    public static List getIndex(int [] list, int target){
        List<String> resultList = new ArrayList<>();

    int i=0,j=0;
        while(i< list.length-1){

            j++;
            if(list[i] + list[j] == target){

                resultList.add(i+","+j);

            }
            if(j == list.length) {
                i++;
            }
        }


        return  resultList;

    }
}
