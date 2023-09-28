/**
 * 
 */
package com.interview.izmo;

import java.io.Serializable;

/**
 * @author yogesh.dangi
 *
 */
public class InventoryPriceRules implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer yearFrom;
	private Integer yearTo;
	private String make;
	private String model;
	private String trim;
	private String fuelType;
	private String body;
	private Integer fromDaysinstock;
	private Integer toDaysinstock;
	private Long fromMileage;
	private Long toMileage;
	private String status;
	private Integer discount;
	private String vehicleType;

	// static String[] order = { "year", "make", "model", "trim", "fuelType",
	// "body", "daysinstock", "mileage", "status" };

	public InventoryPriceRules(Integer yearFrom, Integer yearTo, String make, String model, String trim,
			String fuelType, String vehicleType, String body, Integer fromDaysinstock, Integer toDaysinstock, Long fromMileage, Long toMileage, String status, Integer discount) {
		// super();
		// super(yearFrom, yearTo, make, model, trim, fuelType, inventoryType,
		// body, daysinstock, mileage, status);
		/*
		 * this.setYearFrom(yearFrom); this.setYearTo(yearTo);
		 */
		this.yearFrom = yearFrom;
		this.yearTo = yearTo;
		this.make = make;
		this.model = model;
		this.trim = trim;
		this.fuelType = fuelType;
		this.vehicleType = vehicleType;
		this.body = body;
		this.fromDaysinstock = fromDaysinstock;
		this.toDaysinstock = toDaysinstock;
		this.fromMileage = fromMileage;
		this.toMileage = toMileage;
		this.status = status;
		this.discount = discount;
	}

	/*@Override
	public int compareTo(Object o) {
		InventoryPriceRules priceRules = (InventoryPriceRules) o;
		if (priceRules.getDiscount() > this.getDiscount())
			return 1;
		else if (priceRules.getDiscount() < this.getDiscount())
			return -1;
		return 0;
	}*/

	public Integer getYearFrom() {
		return yearFrom;
	}

	public void setYearFrom(Integer yearFrom) {
		this.yearFrom = yearFrom;
	}

	public Integer getYearTo() {
		return yearTo;
	}

	public void setYearTo(Integer yearTo) {
		this.yearTo = yearTo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "InventoryPriceRules [yearFrom=" + yearFrom + ", yearTo=" + yearTo + ", make=" + this.getMake()
				+ ", model=" + this.getModel() + ", trim=" + this.getTrim() + ", fuelType=" + this.getFuelType()
				+ ", vehicleType=" + this.getVehicleType() + ", body=" + this.getBody() + ", daysinstock="
				+ this.getFromDaysinstock() + ", mileage=" + this.getFromMileage() + ", status=" + this.getStatus() + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getFromDaysinstock() {
		return fromDaysinstock;
	}

	public void setFromDaysinstock(Integer fromDaysinstock) {
		this.fromDaysinstock = fromDaysinstock;
	}

	public Integer getToDaysinstock() {
		return toDaysinstock;
	}

	public void setToDaysinstock(Integer toDaysinstock) {
		this.toDaysinstock = toDaysinstock;
	}

	public Long getFromMileage() {
		return fromMileage;
	}

	public void setFromMileage(Long fromMileage) {
		this.fromMileage = fromMileage;
	}

	public Long getToMileage() {
		return toMileage;
	}

	public void setToMileage(Long toMileage) {
		this.toMileage = toMileage;
	}
}
