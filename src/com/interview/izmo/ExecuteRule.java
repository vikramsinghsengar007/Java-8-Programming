package com.interview.izmo;

import java.util.ArrayList;
import java.util.List;

public class ExecuteRule {

	public int prepareAndExecuteRules(
			InventoryMaster masterVals, InventoryPriceRules inventoryPriceRules) {
		int checkCurrentStatus = 0;

		List<String> ruleData1 = new ArrayList<>();
		ruleData1.add(inventoryPriceRules.getYearFrom().toString());
		ruleData1.add(inventoryPriceRules.getYearTo().toString());
		RuleMatcher matcher1 = new RuleMatcher(FilterType.BETWEEN, ruleData1,
				masterVals.getYear().toString());
		checkCurrentStatus = matcher1.executeRule();

		
			List<String> ruleData2 = new ArrayList<>();
			ruleData2.add(inventoryPriceRules.getMake());
			RuleMatcher matcher2 = new RuleMatcher(FilterType.EQUAL, ruleData2,
					masterVals.getMake());
			checkCurrentStatus += matcher2.executeRule();

			List<String> ruleData3 = new ArrayList<>();
			ruleData3.add(inventoryPriceRules.getModel());
			RuleMatcher matcher3 = new RuleMatcher(FilterType.EQUAL, ruleData3,
					masterVals.getModel());
			checkCurrentStatus += matcher3.executeRule();

			List<String> ruleData4 = new ArrayList<>();
			ruleData4.add(inventoryPriceRules.getTrim());
			RuleMatcher matcher4 = new RuleMatcher(FilterType.EQUAL, ruleData4,
					masterVals.getTrim());
			checkCurrentStatus += matcher4.executeRule();

			List<String> ruleData5 = new ArrayList<>();
			ruleData5.add(inventoryPriceRules.getFuelType());
			RuleMatcher matcher5 = new RuleMatcher(FilterType.EQUAL, ruleData5,
					masterVals.getFuelType());
			checkCurrentStatus += matcher5.executeRule();

			List<String> ruleData6 = new ArrayList<>();
			ruleData6.add(inventoryPriceRules.getVehicleType());
			RuleMatcher matcher6 = new RuleMatcher(FilterType.EQUAL, ruleData6,
					masterVals.getVehicleType());
			checkCurrentStatus += matcher6.executeRule();

			List<String> ruleData7 = new ArrayList<>();
			ruleData7.add(inventoryPriceRules.getBody());
			RuleMatcher matcher7 = new RuleMatcher(FilterType.EQUAL, ruleData7,
					masterVals.getBody());
			checkCurrentStatus += matcher7.executeRule();

			List<String> ruleData8 = new ArrayList<>();
			ruleData8.add(inventoryPriceRules.getFromDaysinstock().toString());
			ruleData8.add(inventoryPriceRules.getToDaysinstock().toString());
			RuleMatcher matcher8 = new RuleMatcher(FilterType.BETWEEN, ruleData8,
					masterVals.getDaysinstock().toString());
			checkCurrentStatus += matcher8.executeRule();

			List<String> ruleData9 = new ArrayList<>();
			ruleData9.add(inventoryPriceRules.getFromMileage().toString());
			ruleData9.add(inventoryPriceRules.getToMileage().toString());
			RuleMatcher matcher9 = new RuleMatcher(FilterType.BETWEEN, ruleData9,
					masterVals.getMileage().toString());
			checkCurrentStatus += matcher9.executeRule();

			List<String> ruleData10 = new ArrayList<>();
			ruleData10.add(inventoryPriceRules.
					getStatus());
			RuleMatcher matcher10 = new RuleMatcher(FilterType.EQUAL,
					ruleData10, masterVals.getStatus());
			checkCurrentStatus += matcher10.executeRule();

		return checkCurrentStatus;
	}
}
