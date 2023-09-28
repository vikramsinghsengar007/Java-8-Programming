package com.hackerrank;

public class Kangaroo {
public static void main(String[] args) {
	System.out.println(kangaroo(0, 2, 5, 3));
	System.out.println(kangaroo(0, 3, 4, 2));
	System.out.println(kangaroo(21, 6, 47, 3));
}

static String kangaroo(int x1, int v1, int x2, int v2) {
	if((x2 > x1 && v2 >= v1) || ((x1-x2) % (v2-v1)) != 0)
	    return "NO";
	else
	    return "YES";

}
}
