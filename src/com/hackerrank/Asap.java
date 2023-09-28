package com.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Asap{
    public static void main(String[] args) {
    	
         Map map = new HashMap();
         map.put(1,"a");         
         map.put(2,"aa");         
         map.put(3,"aaa");         
         map.put(4,"aaaa");         

		
		  for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
		  String str = iterator.next().toString();
		  map.put(5, "b");
		  System.out.println(str);
		  }
		 
         
		/*
		 * for (int i = 0; i < map.size(); i++) { System.out.println(map.get(i));
		 * map.put(5, "b"); }
		 */
    }


}

