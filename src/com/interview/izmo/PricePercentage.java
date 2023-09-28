package com.interview.izmo;

import java.util.ArrayList;
import java.util.List;


public class PricePercentage {
	static InventoryMaster inventoryMaster = null;
	static InventoryPriceRules inventoryPriceRules = null;
	static boolean isApplicable = false;

	static List<InventoryMaster> list = new ArrayList<>();
	static List<InventoryPriceRules> listPriceConfig = new ArrayList<>();
	public static void main(String[] args) {

		/* InventoryMaster(String yearFrom, String yearTo, String make, String model, String trim, String fuelType,
			 String vehicleType, String body, Integer daysinstock, Long mileage, String status )*/
		/* list.add(new InventoryMaster(2015, "FIAT", "100", "1.1", "petrol",  "USED","", 0, Long.valueOf(0),"")); //30
		 list.add(new InventoryMaster(2015, "FIAT", "500", "1.3", "diesel", "USED","", 0, Long.valueOf(0),"")); // 40
		 list.add(new InventoryMaster(2015, "Audi", "500", "1.0", "gas", "USED","", 0, Long.valueOf(0),"")); // null
		 list.add(new InventoryMaster(2015, "FIAT", "200", "1.5", "petrol","USED","", 0, Long.valueOf(0),"")); // 30
		 list.add(new InventoryMaster(0, "FIAT", "", "1.2", "petrol",  "USED","", 0, Long.valueOf(0),"")); //30
 		 list.add(new InventoryMaster(2015, "Audi", "500", "1.4", "",  "NEW","SUV", 0, Long.valueOf(10),"ACTV")); //5
*/

		//list.add(new InventoryMaster(0, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", null, "USED", "Sedan", 120, Long.valueOf(0), "ACTV")); // 30
		
	/*	 list.add(new InventoryMaster(2016, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "diesel", "USED", "Sedan", 12, Long.valueOf(123), "ACTV")); // 10
			
			
			InventoryPriceRules inventoryPriceRules2 = new InventoryPriceRules(2000, 2016, "NISSAN", "", "", "", "USED","", 0,0, Long.valueOf(0),Long.valueOf(0),"ACTV", 5);
			InventoryPriceRules inventoryPriceRules4 = new InventoryPriceRules(0, 2016, "NISSAN", "", "", "", "USED", "sedan",0,0, Long.valueOf(0),Long.valueOf(0), "", 30);
			InventoryPriceRules inventoryPriceRules1 = new InventoryPriceRules(0, 2016, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "", "USED", "Sedan", 0,0, Long.valueOf(0),Long.valueOf(0), "ACTV", 10);
			InventoryPriceRules inventoryPriceRules3 = new InventoryPriceRules(2000, 2017, "", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "diesel", "USED", "Sedan", 0,0, Long.valueOf(0),Long.valueOf(0), "ACTV", 6);
		*/
		
list.add(new InventoryMaster(2016, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "diesel", "USED", "Sedan", 12, Long.valueOf(123), "ACTV")); // 10
		
		
		InventoryPriceRules inventoryPriceRules2 = new InventoryPriceRules(2000, 2016, "NISSAN", "", "", "", "USED","", 0,12, Long.valueOf(0),Long.valueOf(0),"", 5);
		InventoryPriceRules inventoryPriceRules4 = new InventoryPriceRules(0, 2016, "NISSAN", "", "", "", "USED", "sedan", 12,12, Long.valueOf(0),Long.valueOf(0), "ACTV", 30);
		InventoryPriceRules inventoryPriceRules1 = new InventoryPriceRules(0, 2011, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "", "USED", "Sedan", 0,0, Long.valueOf(0),Long.valueOf(0), "ACTV", 10);
		InventoryPriceRules inventoryPriceRules3 = new InventoryPriceRules(2000, 2017, "NISSAN", "TIIDA SEDAN", "SEDAN DRIVE TM CA", "", "USED", "Sedan", 0,0, Long.valueOf(0),Long.valueOf(0), "ACTV", 6);
		 
		 /*InventoryPriceRules inventoryPriceRules2 = new InventoryPriceRules(2000, 2015, "FIAT", "500", "", "petrol", "USED","", 0, Long.valueOf(0),"", 50);
		 InventoryPriceRules inventoryPriceRules3 = new InventoryPriceRules(0, 0, "FIAT", "500", "1.3", "diesel", "USED","", 0, Long.valueOf(0),"", 20);
		 InventoryPriceRules inventoryPriceRules4 = new InventoryPriceRules(0, 2015, "FIAT", "500", "","", "USED","", 0, Long.valueOf(0),"", 40);
		 InventoryPriceRules inventoryPriceRules5 = new InventoryPriceRules(2015, 2015, "Audi", "", "1.4","", "NEW","", 0, Long.valueOf(10),"", 5);*/
		 
		 listPriceConfig.add(inventoryPriceRules1);
		 listPriceConfig.add(inventoryPriceRules4);
		 listPriceConfig.add(inventoryPriceRules3);
		 listPriceConfig.add(inventoryPriceRules2);
		 //sorting discount wise
//		 Collections.sort(listPriceConfig);
		 //System.out.println(listPriceConfig);
		 for (InventoryMaster master : list) {
			 findDiscount(master, listPriceConfig);
			 System.out.println(master);
		}
	}

	// to find the discount from priceRules
	public static void findDiscount(InventoryMaster inventoryMaster, List<InventoryPriceRules> rules) {
		int prevSatisfyCount = 0;
		for (InventoryPriceRules inventoryPriceRules : rules) {
			
			if (inventoryPriceRules.getMake().isEmpty() || inventoryMaster.getMake().equalsIgnoreCase(
					inventoryPriceRules.getMake())) {
				ExecuteRule executeRule = new ExecuteRule();
				int currSatisfyCount = executeRule.prepareAndExecuteRules(
						inventoryMaster, inventoryPriceRules);
				
				//if any fields are not matching or is empty
				if (currSatisfyCount == 0) {
					inventoryMaster.setDiscount(inventoryPriceRules
							.getDiscount());
				}

				else if (prevSatisfyCount < currSatisfyCount) {
					prevSatisfyCount = currSatisfyCount;
					// if(inventoryMaster.getDiscount() <
					// inventoryPriceRules.getDiscount())
					inventoryMaster.setDiscount(inventoryPriceRules
							.getDiscount());
				}
				
				else if (prevSatisfyCount == currSatisfyCount) {
					if(inventoryMaster.getDiscount() <
							inventoryPriceRules.getDiscount()) {
						inventoryMaster.setDiscount(inventoryPriceRules
								.getDiscount());
					}
				}
			}
		}
	}
			
			
}
