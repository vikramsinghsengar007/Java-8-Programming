package com.siemens;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLength implements Comparator<String> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("asd");
        list.add("sn");
        SortByLength test = new SortByLength();
        Collections.sort(list, test);
        System.out.println(list);

    }


    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length())
            return o1.compareTo(o2);
        else
           return o2.compareTo(o1);
    }
}
