package com.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GradingStudents {
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		System.out.println(gradingStudents(grades));
	}
	
	 public static List<Integer> gradingStudents(List<Integer> grades) {
		    List<Integer> finalList = new ArrayList<>();
		 for (Iterator<Integer> iterator = grades.iterator(); iterator.hasNext();) {
			Integer grade = (Integer) iterator.next();
			
				grade = (grade < 38 || grade % 5 < 3) ? grade : grade + (5 - (grade % 5));
			finalList.add(grade);
		}
return finalList;
		    }
}
