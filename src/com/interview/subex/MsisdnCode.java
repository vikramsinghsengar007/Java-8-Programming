package com.interview.subex;

import java.util.ArrayList;
import java.util.List;

public class MsisdnCode {
	public static void main(String[] args) {
		MsisdnCode  code= new MsisdnCode();
		for (String string : code.msisdnNo()) {
			System.out.println(string);
		}
		System.out.println(code.MobileNumber());
		
	}
		
			public List MobileNumber(){
				 
				for (int i = 0; i < msisdnNo().length; i++) {
					System.out.println(msisdnNo());
					
				}
				return null;
				
				
				
				
			}
			public String[] msisdnNo(){
				List msisdnnolist = new ArrayList();
				msisdnnolist.add("+917933946874");
				msisdnnolist.add("08078425246");
				msisdnnolist.add("080555123456785");
				
				String msisdnno[] = new String[msisdnnolist.size()];
				for (int i = 0; i < msisdnno.length; i++) {
					msisdnno[i] = msisdnnolist.get(i).toString(); 
				}
				
				return msisdnno;
				
			}
	
}

class CountryCode{
	public ArrayList countryCode(){
		List list = new ArrayList();
		list.add("+91");
		list.add("080");list.add("080555");
		return (ArrayList) list;
	}
}