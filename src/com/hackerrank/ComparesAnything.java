package com.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class StringComparator implements Comparator<String> {
   @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
}

 
public class ComparesAnything {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp ;
        
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0){
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    comp = new StringComparator();
                    System.out.println((comp.compare(s1,s2) == 0) ? "Same" : "Different" );
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    comp = new StringComparator();
                    System.out.println( (comp.compare(String.valueOf(num1), String.valueOf(num2)) == 0) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    Object[] outarr1 = {array1};
                    Object[] outarr2 = {array2};
                    if (Arrays.deepEquals(outarr1, outarr2)) 
                        System.out.println("Same"); 
                    else
                        System.out.println("Different"); 
                  
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
            }// end switch
    }// end while
        scan.close();
    }
}
