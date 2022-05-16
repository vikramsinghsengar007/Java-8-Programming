package com.interview;

import java.util.ArrayList;

public class MaxProfitFromStock {
    public static void main(String[] args) {


        int price[] = {100, 180, 260, 310, 40, 535, 565};
        int size = price.length; // computing the size

        System.out.println("The price of the stock on different days is: ");
        stockBuySell(price, size);

    }

    // A method that computes the maximum profit using the cost of the stock
   static  void stockBuySell(int p[], int size)
    {
// We can not buy and sell the stock on the same day
// Hence, there is no need to proceed further
        if (size == 1)
        {
            System.out.println("No profit is possible as the number of days is equal to 1");
            return;
        }

        int c = 0;

// the solution array
        ArrayList<Interval> al = new ArrayList<Interval>();

// Traversing through the given array of price
        int j = 0;
        while (j < size - 1)
        {
// Findinng the Local Minima. Note that the limit is (size - 2) as we are
// doing the comparison of the present element to the next element.
            while ((j < size - 1) && (p[j + 1] <= p[j]))
            {
                j = j + 1;
            }

// If we reached the end, break as
// there are no further possible solutions
            if (j == size - 1)
            {
                break;
            }

// creating an object of the class interval
            Interval in = new Interval();
// Store the index of minima
            in.buy = j + 1;
            j = j + 1;


// Find Local Maxima. Note that the limit is (size - 1) as we
// have to compare to previous element
            while ((j < size) && (p[j] >= p[j - 1]))
            {
                j = j + 1;
            }

// storing the index for the maxima
            in.sell = j;
            al.add(in);

// Incrementing the number of buy or sell
            c = c + 1;
        }

// displaying the solution
        if (c == 0)
        {
            System.out.println("Buying the stock on any given day will not make the profit.");
        }
        else
        {
            int ans = 0;
            int maxProfit=0, temp, buyStock = 0, sellStock = 0;
            for (int i = 0; i < c; i++)
            {
                System.out.println("Buy the stock on day: " + al.get(i).buy
                        + "  "
                        + "Sell the stock on day: " + al.get(i).sell);


                ans = ans + (p[(al.get(i).sell - 1)] - p[(al.get(i).buy - 1)]);

                temp = p[(al.get(i).sell - 1)] - p[(al.get(i).buy - 1)];

                if(maxProfit ==0 || temp > maxProfit) {
                    maxProfit = temp;
                    sellStock = p[(al.get(i).sell - 1)];
                    buyStock = p[(al.get(i).buy - 1)];
                }


            }

            System.out.println("Thus, the total profit is: " + ans);

            System.out.println("If you'll Buy the stock : " + buyStock
                    + " and "
                    + "Sell the stock: " + sellStock
                    + ", you'll get the max profit of "+ maxProfit);


        }



        return;
    }
}

class Interval
{
    int buy;
    int sell;
}