package com.interview.swiss;

@FunctionalInterface
public interface CustomerFunctional {

         int add(int a, int b);

 default void show(){
            System.out.println("default a.show");
        }
    static void display(){
        System.out.println("static a.display");
    }

    default int square(int a){
     return a*a;
    }
}
