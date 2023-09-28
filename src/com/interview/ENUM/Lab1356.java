package com.interview.ENUM;

public class Lab1356 {
		public static void main(String[] args) {
			Course c1=Course.JAVA;
			System.out.println(c1);
			System.out.println(Course.JDBC);
			System.out.println(Course.jsp);
			System.out.println(Course.STRUTS);
			Course c2=Course.STRUTS;
			c2.setId(5);
			c2.setName("Struts");
			c2.setFacultyName("Dande");
			c2.setDuration(3);
			c2.setFee(1200);
			System.out.println(c2);
		}
}

class Course{
	public static Course JAVA=new Course(1,"java","manish",3,1000);
	public static Course JDBC=new Course(2,"jdbc","manish",1,2000);
	public static Course jsp=new Course(3,"jsp","sri",2,4000);
	public static Course STRUTS=new Course();
	private int id;
	private String name;
	private String facultyName;
	private int duration;
	private double fee;
	 Course() {}
	public Course(int id, String name, String facultyName, int duration,
			double fee) {
		this.id = id;
		this.name = name;
		this.facultyName = facultyName;
		this.duration = duration;
		this.fee = fee;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString() {
				return id+"\t"+name+"\t"+facultyName+"\t"+duration+"\t"+fee;
		}	
}