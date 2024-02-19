package com.hackerrank;

public class CountingValleys {
    public static void main(String[] args) {
    System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int sum=0, velly =0;
        for(int i=0; i< steps; i++){
            if(path.charAt(i) == 'U'){
                if(sum == -1){
                    velly++;
                }
                sum++;
            }else {
                sum--;
            }
        }
        return velly;
    }
}
