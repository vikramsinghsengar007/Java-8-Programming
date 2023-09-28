package com.interview.immutable;

public class Lab1178 {
		public static void main(String[] args) {
			
			Students s=new Students(1, "vik");
			System.out.println(s);
			Address a=new Address("19/2", 486001);
			System.out.println(a);
			//a.aid="20";
			//a.pin=123654;
			
		}
}

final class Students{
	private final int sid;
	private final String sname;
	public Students(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + "]";
	}
}

final class Address{
	private final String aid;
	private final int pin;
	public Address(String aid, int pin) {
		super();
		this.aid = aid;
		this.pin = pin;
	}
	
	public String getAid() {
		return aid;
	}

	public int getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", pin=" + pin + "]";
	}
	
}