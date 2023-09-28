package com.dataStructure.arrayList;

import java.util.ArrayList;
import java.util.TreeSet;

public class CustomArrayList<E> extends ArrayList<E> {
	TreeSet<E> treeSet = new TreeSet<>();
	@Override
	public boolean add(E e) {
		return treeSet.add(e);
	}
}
