package com.interview.anveksha;

public class Aveksha7 {
	public static int position=0;
	public static int count=0;
	public static boolean validate=false;
 public static void main(String[] args) {
	int arr[]={1,2,3,50,99,100};
	findMissingElement(arr, position);
 }

	public static void findMissingElement(int a[],int position){
		if(position==a.length){
			return;			
		}
		for (; position < a.length; position++) {
			if((a[position]-count)!=position){
				System.out.println("missing "+(position+count));
				validate=true;
				count++;
				break;
			}
		}
		if (validate) {
			validate=false;
			findMissingElement(a, position);
		}
}
}
