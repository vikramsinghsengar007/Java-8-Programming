package com.hackerrank;

public class ElectronicsShop {
    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3,1},new int[]{5,2,8}, 10));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b){
        int maximum = 0;
        int sum;
        for(int i = 0; i < keyboards.length; i ++){
            for(int j = 0; j < drives.length; j++){
                sum = keyboards[i] + drives[j];
                if(sum >= maximum && sum <= b){
                    maximum = sum;
                }
            }
        }
        if(maximum == 0) return -1;
        return maximum;
    }
}
