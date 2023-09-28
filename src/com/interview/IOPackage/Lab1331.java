package com.interview.IOPackage;

import java.io.IOException;

public class Lab1331 {
		public static void main(String[] args) throws IOException {
			JlcReader rd=new JlcReader();
			System.out.println("enter sid ");
			String sid=rd.readLine();
			System.out.println("enter name ");
			String sname=rd.readLine();
			System.out.println("enter phone");
			String ph=rd.readLine();
			System.out.println(sid+"\t"+sname+"\t"+ph);
		}
}

class JlcReader{
	public String readLine() throws IOException{
		StringBuffer val=new StringBuffer();
		while(true){
			int asc=System.in.read();
			if (asc==13) ;
			else if(asc==10)
					break;
					else{
						char ch=(char) asc;
						val.append(ch);
			}
		}
		return val.toString();
		
	}
}