package com.interview.verifone;

import java.util.Scanner;

public class Suffix {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String reverse1 = "";
        String reverse2 = "";
        System.out.println("Please enter the first string: ");
        String s1 = input.nextLine();

        System.out.println("Please enter the second string: ");
        String s2 = input.nextLine();

        for (int i = s1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + s1.charAt(i);
        }

        for (int i = s2.length() - 1; i >= 0; i--) {
            reverse2 = reverse2 + s2.charAt(i);
        }

        int reverse1Len = reverse1.length();
        int reverse2Len = reverse2.length();

        if (reverse1Len < reverse2Len) {
            int l3 = reverse1Len;
            System.out.println(commonSuffix(reverse1, reverse2, l3));
        } else {
            int l3 = reverse2Len;
            System.out.println(commonSuffix(reverse1, reverse2, l3));
        }
    }
    public static String commonSuffix(String reverse1, String reverse2, int l3) {
        String suffixies = "";
        for (int k = 0; k < l3; k++) {
            if (reverse1.charAt(k) != reverse2.charAt(k)) {
                break;
            } else {
                suffixies += reverse1.charAt(k);
            }
        }
        String finalStr="";
        for (int i = suffixies.length()-1; i >= 0 ; i--) {
			finalStr += suffixies.charAt(i);
 		}
		return !finalStr.isEmpty() ? finalStr : "no Suffix";
        }
}