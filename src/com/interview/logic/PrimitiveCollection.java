package com.interview.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimitiveCollection {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int arr[]= {1,2,3,4,5,6,7,8,9};
		List<?> l =new ArrayList<Object>();
		Iterator<?> it = l.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}
}
