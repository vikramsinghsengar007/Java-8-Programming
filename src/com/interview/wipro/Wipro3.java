package com.interview.wipro;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Wipro3 {
		public static void main(String[] args) {
		 	TreeSet set=new TreeSet(new EmpComp());
		 	set.add(new Employee(1, "sd"));
		 	set.add(new Employee(7, "f"));
		 	set.add(new Employee(3, "ww"));
		 	set.add(new Employee(2, "dz"));
		 	
		 	System.out.println(set);
		 	Iterator it= set.iterator();
		 	while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
}

class Employee{
	int eid; String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "eid: "+eid+" ename: "+ename;
	}
}

class EmpComp implements Comparator{
		
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			Employee e1= (Employee) o1;
			Employee e2= (Employee) o2;
			return e1.ename.compareTo(e2.ename);
		}
		return 0;
	}
	
}
