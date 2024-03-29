package com.prepration;

import java.io.Serializable;
import java.util.Objects;

public class Singleton implements Serializable, Cloneable{
    private static final long serialVersionUID = 1L;
    private static int count =0;
   private Singleton(){
        count++;
    }
    private static Singleton singleton;

   public static Singleton getInstance(){
       synchronized (Singleton.class){
           if(singleton==null && count <=1){
               singleton = new Singleton();
           }else{
               return singleton;
           }
           return singleton;
       }
   }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.hashCode();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(Objects.equals(singleton1, singleton));

    }

    @Override
    public int hashCode() {
        return Objects.hash(singleton);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}