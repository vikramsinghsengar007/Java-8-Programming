package com.interview.logic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class ListTop {
	public static void main(String[] args) {
		Map map = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o1.intValue() > o2.intValue())
					return -1;
				else if(o1.intValue() < o2.intValue())
					return 1;
				return 0;
			}
		});
		map.put(1,1);
		map.put(1,1);map.put(22,3);map.put(3,33);map.put(34,122);map.put(5,7);map.put(66,77);map.put(7,33);
		map.put(8,99);
		map.put(9,112);map.put(10,187);map.put(11,22);map.put(12,72);map.put(13,8);map.put(14,21);
		map.put(15,16);map.put(16,100);
		
		Iterator itr = map.entrySet().iterator();
		
		int i=1;
		
		while(itr.hasNext() && i <= 10) {
			System.out.print(itr.next()+"   ");
			++i;
		}
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.print(new ArrayList(map.values()).get(i)+"   ");
		}*/
		
	}
}
