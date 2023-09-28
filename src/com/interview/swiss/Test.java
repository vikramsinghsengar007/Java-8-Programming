package com.interview.swiss;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        List<Integer> newList = numbers.stream().distinct().collect(Collectors.toList());

String s1 = "vikram";
String s2 = "vkm";


    }
}

class Singleton implements Cloneable, Serializable {
    public static Singleton singleton;
    private Singleton(){}

    public Object clone() throws CloneNotSupportedException{
        return singleton;
    }

    public static  Singleton getSingleton(){
        synchronized(Singleton.class){
            if(singleton == null){
                return new Singleton();
            }else{
                return singleton;
            }
        }
    }
}
