package com.hackerrank;

public class CatAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(1,3,2));
    }

    static String catAndMouse(int x, int y, int z) {
        int distanceAFromM = Math.abs(x-z);
        int distanceBFromM = Math.abs(y-z);

        if(distanceAFromM > distanceBFromM){
            return "Cat A";
        }else if(distanceAFromM < distanceBFromM){
            return "Cat B";
        }else {
            return "Mouse C";
        }

    }
}
