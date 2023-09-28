package com.interview.String;

import java.util.Date;

public final class CustomImmutable {
		private final Integer immutablenum;
		private final String immutablestr;
		private final Date immutableDate;
		
		public CustomImmutable(Integer immutablenum, String immutablestr,Date date) {
			this.immutablenum = immutablenum;
			this.immutablestr = immutablestr;
			this.immutableDate= new Date(date.getTime());
		}
		public Integer getImmutablenum() {
			return immutablenum;
		}
		public String getImmutablestr() {
			return immutablestr;
		}
		public Date getImmutableDate() {
			return new Date(immutableDate.getTime());
		}
		public static void main(String[] args) {
			
		}
		
		
}
