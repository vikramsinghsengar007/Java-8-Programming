package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		String magazineStr= "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
		String noteStr= "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";
checkMagazine(magazineStr, noteStr);
	}
	
	
	static void checkMagazine(String magazineStr, String noteStr) {
		String magazine[] = magazineStr.split(" ");
		String note[] = noteStr.split(" ");
		
		int count=0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < note.length; i++) {
			if(note.length > magazine.length) {
				System.out.println("No");
			return;
			}
			count =0;
			for (int j = 0; j < magazine.length; j++) {
				if(note[i].equals(magazine[j])) {
					if(count >1) continue;
					count +=1;
					map.put(magazine[i], count);
				}
			}
		}
		System.out.println(map.entrySet());
		if(map.keySet().size() == note.length)
			System.out.println("Yes");
		else
			System.out.println("No");

    }

}
