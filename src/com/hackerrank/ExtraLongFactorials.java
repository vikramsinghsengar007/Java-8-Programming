package com.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
            extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n){
        BigInteger factorial =BigInteger.ONE;
        for(int i=1;i<=n;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
