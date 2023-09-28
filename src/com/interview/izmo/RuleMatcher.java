package com.interview.izmo;

import java.util.List;

enum FilterType {
	IN, BETWEEN, EQUAL, LIKE
}

public class RuleMatcher {
	String masterVal;							//make
	List<String> ruleData ;                     //single="Honda", multiple="Honda","Acura"
	private FilterType filtertype;          //IN
	
	private InventoryPriceRules priceRules;
	
	public RuleMatcher(final FilterType filtertype, final List<String> ruleData, String masterVal) {
		this.masterVal = masterVal;
		this.filtertype = filtertype;
		this.ruleData = ruleData;
	}
	
	public int executeRule() {
		boolean isSatisfy = false;
		switch(filtertype) {
		case IN:
			isSatisfy = (ruleData != null && ruleData.contains(masterVal)) ? true : false;
			break;
		case BETWEEN:
			if(ruleData.size() == 2) {
				if(ruleData.get(0).equals("0") && ruleData.get(1).equals("0"))
					isSatisfy = true;
				else
					isSatisfy = (ruleData.get(0).compareTo(masterVal) <= 0 && ruleData.get(1).compareTo(masterVal) >= 0 ) ? true : false;
			}
			break;
		case EQUAL:
			if(ruleData.size() == 1)
				isSatisfy = /*ruleData.get(0).isEmpty() ? true : */ruleData.get(0).equalsIgnoreCase(masterVal) ? true : false;
			break;
		case LIKE:
			
			break;
		default:
			break;
		}
		return (isSatisfy == true) ? 1 : 0;
	}
}