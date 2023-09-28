package com.dataStructure.arrayList;

public class TestList {
	public static void main(String[] args) {
		CustomArrayList<String> arrayList = new CustomArrayList<>();
		arrayList.add("f"); arrayList.add("a"); arrayList.add("d");
		arrayList.add("x");
		arrayList.add("s");
		arrayList.add("g");
		
		System.out.println(arrayList);
	}
}
