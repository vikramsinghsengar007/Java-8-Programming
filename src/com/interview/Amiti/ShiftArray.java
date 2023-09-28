package com.interview.Amiti;

import java.util.Scanner;

public class ShiftArray
{
public static void main(String[] args)
{
   int[] num = new int[10];
   Scanner input = new Scanner(System.in);
   System.out.println("Enter " + num.length + " values:");

   for(int x = 0; x < num.length; x ++)
   {
        num[x] = input.nextInt();
   }

   shiftRight(num);
   System.out.println("After shifting the array is:");

   for(int x = 0; x < num.length; x ++)
   {
          System.out.print(num[x] + " ");
   }
}


public static void shiftRight(int[] list)
{
   if (list.length < 2) return;

   int last = list[list.length - 1];

   for(int i = list.length - 1; i > 0; i--) {
				  list[i] = list[i - 1];
   }
   list[0] = last;
}
}