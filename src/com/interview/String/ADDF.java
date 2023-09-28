package com.interview.String;

public class ADDF {

	public static void main(String[] args) {

		String min = "00100", max = "00200";
		int num = 0, cnt = 1;
		int countnum = 1;
		for (int i = Integer.parseInt(min); i < Integer.parseInt(max); i++) {
			num = Integer.parseInt(min) + cnt++;

			
			String str = "0".concat(String.valueOf(num));
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			String rev = new String(sb);
			if (str.equals(rev.toString())) {
				System.out.println(str + "  " + countnum++);
			}
		}
	}

}
