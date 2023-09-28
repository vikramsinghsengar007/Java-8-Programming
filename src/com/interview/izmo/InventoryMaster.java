package com.interview.izmo;



import java.math.BigDecimal;
import java.util.Date;


public class InventoryMaster implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private InventoryId id;
	private String inventoryType;
	private String dealerid;
	private String dsprovider;
	private String location;
	private String vin;
	private String stocknumber;
	private String modelnumber;
	private Integer year;
	private String make;
	private String model;
	private String trim;
	private String body;
	private String transmission;
	private String doors;
	private String seats;
	private String enginecylinders;
	private String enginedisplacement;
	private String enginedescription;
	private String driveTrain;
	private String fuelType;
	private String cityMpg;
	private String highwayMpg;
	private String exteriorcolor;
	private String interiorcolor;
	private Long mileage;
	private String certified;
	private BigDecimal invoiceprice;
	private BigDecimal msrp;
	private BigDecimal internetprice;
	private BigDecimal kellyRetailPrice;
	private String standardfeatures;
	private String videoUrl;
	private String srcImages;
	private String images;
	private Integer numberOfImages;
	private Integer daysinstock;
	private Date dateInStock;
	private Integer co2;
	private String powerForTaxes;
	private String hasWarranty;
	private String warrantyDescription;
	private String dealerblurb;
	private Integer adbTrimId;
	private String carfaxStatus;
	private String comments;
	private String caption;
	private String captionComment;
	private BigDecimal monthlyLoanPayment;
	private Date registrationdate;
	private String loanpaymentlegaltext;
	private String geoZoneId;
	private Date reservedUntil;
	private String mixedMpg;
	private String realEnginePower;
	private String transmissionSpeeds;
	private BigDecimal weight;
	private String Package;
	private Boolean hasStockPhotos;
	private BigDecimal takePrice;
	private Integer daysForReconditionCar;
	private Date takeDate;
	private BigDecimal reconditioningAmount;
	private String state;
	private Boolean featuredFlag;
	private Boolean changeFlag;
	private Boolean protectedFlag;
	private String status;
	private String userAdded;
	private Date dateAdded;
	private String userUpdated;
	private Date lastUpdated;
	private String vehicleType;
	private String registrationNumber;
	private Date priceChangeDate;
	private Date soldDate;
	private Integer discount;
	private Integer yearFrom; 
	private Integer yearTo;
	//private Set<InventoryMasterExtension> inventoryExtensions = new HashSet<InventoryMasterExtension>(0);

	/*
	 * private Set<Inventoryvehiclefeatures> inventoryvehiclefeatureses = new
	 * HashSet<Inventoryvehiclefeatures>(0); private Set<InventoryVideos>
	 * inventoryVideoses = new HashSet<InventoryVideos>(0); private
	 * Set<InventoryDiscrepancyReport> inventoryDiscrepancyReports = new
	 * HashSet<InventoryDiscrepancyReport>(0);
	 */
	public InventoryMaster() {
	}

	/*public InventoryMaster(InventoryId id, String inventoryType, String location, String dealerid) {
		this.id = id;
		this.inventoryType = inventoryType;
		this.location = location;
		this.dealerid = dealerid;
	}*/

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public InventoryMaster( String inventoryType, String dealerid, String dsprovider, String location,
			String vin, String stockNumber, String modelNumber, Integer year, String make, String model, String trim,
			String body, String transmission, String doors, String seats, String engineCylinders,
			String engineDisplacement, String engineDescription, String driveTrain, String fuelType, String cityMpg,
			String highwayMpg, String exteriorColor, String interiorColor, Long mileage, String certified,
			BigDecimal invoicePrice, BigDecimal msrp, BigDecimal internetPrice, BigDecimal kellyRetailPrice,
			String standardFeatures, String videoUrl, String srcImages, String images, Integer numberOfImages,
			Integer daysInStock, Date dateInStock, Integer co2, String powerForTaxes, String hasWarranty,
			String warrantyDescription, String dealerblurb, BigDecimal trimMatchScore, Integer adbTrimId,
			String carfaxStatus, String comments, String caption, String captionComment, BigDecimal monthlyLoanPayment,
			Date registrationDate, String loanPaymentLegalText, String geoZoneId, Date reservedUntil, String mixedMpg,
			String realEnginePower, String transmissionSpeeds, BigDecimal weight, String package1,
			Boolean hasStockPhotos, BigDecimal takePrice, Integer daysForReconditionCar, Date takeDate,
			BigDecimal reconditioningAmount, String state, Boolean featuredFlag, Boolean changeFlag,
			Boolean protectedFlag, String status, String userAdded, Date dateAdded, String userUpdated,
			Date lastUpdated, String vehicleType, Date priceChangeDate, Date soldDate) {
		super();
		this.inventoryType = inventoryType;
		this.dealerid = dealerid;
		this.dsprovider = dsprovider;
		this.location = location;
		this.vin = vin;
		this.stocknumber = stockNumber;
		this.modelnumber = modelNumber;
		this.year = year;
		this.make = make;
		this.model = model;
		this.trim = trim;
		this.body = body;
		this.transmission = transmission;
		this.doors = doors;
		this.seats = seats;
		this.enginecylinders = engineCylinders;
		this.enginedisplacement = engineDisplacement;
		this.enginedescription = engineDescription;
		this.driveTrain = driveTrain;
		this.fuelType = fuelType;
		this.cityMpg = cityMpg;
		this.highwayMpg = highwayMpg;
		this.exteriorcolor = exteriorColor;
		this.interiorcolor = interiorColor;
		this.mileage = mileage;
		this.certified = certified;
		this.invoiceprice = invoicePrice;
		this.msrp = msrp;
		this.internetprice = internetPrice;
		this.kellyRetailPrice = kellyRetailPrice;
		this.standardfeatures = standardFeatures;
		this.videoUrl = videoUrl;
		this.srcImages = srcImages;
		this.images = images;
		this.numberOfImages = numberOfImages;
		this.daysinstock = daysInStock;
		this.dateInStock = dateInStock;
		this.co2 = co2;
		this.powerForTaxes = powerForTaxes;
		this.hasWarranty = hasWarranty;
		this.warrantyDescription = warrantyDescription;
		this.dealerblurb = dealerblurb;
		this.adbTrimId = adbTrimId;
		this.carfaxStatus = carfaxStatus;
		this.comments = comments;
		this.caption = caption;
		this.captionComment = captionComment;
		this.monthlyLoanPayment = monthlyLoanPayment;
		this.registrationdate = registrationDate;
		this.loanpaymentlegaltext = loanPaymentLegalText;
		this.geoZoneId = geoZoneId;
		this.reservedUntil = reservedUntil;
		this.mixedMpg = mixedMpg;
		this.realEnginePower = realEnginePower;
		this.transmissionSpeeds = transmissionSpeeds;
		this.weight = weight;
		Package = package1;
		this.hasStockPhotos = hasStockPhotos;
		this.takePrice = takePrice;
		this.daysForReconditionCar = daysForReconditionCar;
		this.takeDate = takeDate;
		this.reconditioningAmount = reconditioningAmount;
		this.state = state;
		this.featuredFlag = featuredFlag;
		this.changeFlag = changeFlag;
		this.protectedFlag = protectedFlag;
		this.status = status;
		this.userAdded = userAdded;
		this.dateAdded = dateAdded;
		this.userUpdated = userUpdated;
		this.lastUpdated = lastUpdated;
		this.vehicleType = vehicleType;
		this.priceChangeDate = priceChangeDate;
		this.soldDate = soldDate;
	}

	
	
	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	
	public String getDealerid() {
		return dealerid;
	}

	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}

	public String getDsprovider() {
		return dsprovider;
	}

	public void setDsprovider(String dsprovider) {
		this.dsprovider = dsprovider;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCityMpg() {
		return cityMpg;
	}

	public void setCityMpg(String cityMpg) {
		this.cityMpg = cityMpg;
	}

	public String getHighwayMpg() {
		return highwayMpg;
	}

	public void setHighwayMpg(String highwayMpg) {
		this.highwayMpg = highwayMpg;
	}

	public Long getMileage() {
		return mileage;
	}

	public void setMileage(Long mileage) {
		this.mileage = mileage;
	}

	public String getCertified() {
		return certified;
	}

	public void setCertified(String certified) {
		this.certified = certified;
	}

	public BigDecimal getMsrp() {
		return msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	public BigDecimal getKellyRetailPrice() {
		return kellyRetailPrice;
	}

	public void setKellyRetailPrice(BigDecimal kellyRetailPrice) {
		this.kellyRetailPrice = kellyRetailPrice;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getSrcImages() {
		return srcImages;
	}

	public void setSrcImages(String srcImages) {
		this.srcImages = srcImages;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Integer getNumberOfImages() {
		return numberOfImages;
	}

	public void setNumberOfImages(Integer numberOfImages) {
		this.numberOfImages = numberOfImages;
	}

	public Date getDateInStock() {
		return dateInStock;
	}

	public void setDateInStock(Date dateInStock) {
		this.dateInStock = dateInStock;
	}

	public Integer getCo2() {
		return co2;
	}

	public void setCo2(Integer co2) {
		this.co2 = co2;
	}

	public String getPowerForTaxes() {
		return powerForTaxes;
	}

	public void setPowerForTaxes(String powerForTaxes) {
		this.powerForTaxes = powerForTaxes;
	}

	public String getHasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(String hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getWarrantyDescription() {
		return warrantyDescription;
	}

	public void setWarrantyDescription(String warrantyDescription) {
		this.warrantyDescription = warrantyDescription;
	}

	public String getDealerblurb() {
		return dealerblurb;
	}

	public void setDealerblurb(String dealerblurb) {
		this.dealerblurb = dealerblurb;
	}

	public Integer getAdbTrimId() {
		return adbTrimId;
	}

	public void setAdbTrimId(Integer adbTrimId) {
		this.adbTrimId = adbTrimId;
	}

	public String getCarfaxStatus() {
		return carfaxStatus;
	}

	public void setCarfaxStatus(String carfaxStatus) {
		this.carfaxStatus = carfaxStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public BigDecimal getMonthlyLoanPayment() {
		return monthlyLoanPayment;
	}

	public void setMonthlyLoanPayment(BigDecimal monthlyLoanPayment) {
		this.monthlyLoanPayment = monthlyLoanPayment;
	}

	public String getGeoZoneId() {
		return geoZoneId;
	}

	public void setGeoZoneId(String geoZoneId) {
		this.geoZoneId = geoZoneId;
	}

	public Date getReservedUntil() {
		return reservedUntil;
	}

	public void setReservedUntil(Date reservedUntil) {
		this.reservedUntil = reservedUntil;
	}

	public String getMixedMpg() {
		return mixedMpg;
	}

	public void setMixedMpg(String mixedMpg) {
		this.mixedMpg = mixedMpg;
	}

	public String getRealEnginePower() {
		return realEnginePower;
	}

	public void setRealEnginePower(String realEnginePower) {
		this.realEnginePower = realEnginePower;
	}

	public String getTransmissionSpeeds() {
		return transmissionSpeeds;
	}

	public void setTransmissionSpeeds(String transmissionSpeeds) {
		this.transmissionSpeeds = transmissionSpeeds;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getPackage() {
		return Package;
	}

	public void setPackage(String package1) {
		Package = package1;
	}

	public Boolean getHasStockPhotos() {
		return hasStockPhotos;
	}

	public void setHasStockPhotos(Boolean hasStockPhotos) {
		this.hasStockPhotos = hasStockPhotos;
	}

	public BigDecimal getTakePrice() {
		return takePrice;
	}

	public void setTakePrice(BigDecimal takePrice) {
		this.takePrice = takePrice;
	}

	public Integer getDaysForReconditionCar() {
		return daysForReconditionCar;
	}

	public void setDaysForReconditionCar(Integer daysForReconditionCar) {
		this.daysForReconditionCar = daysForReconditionCar;
	}

	public Date getTakeDate() {
		return takeDate;
	}

	public void setTakeDate(Date takeDate) {
		this.takeDate = takeDate;
	}

	public BigDecimal getReconditioningAmount() {
		return reconditioningAmount;
	}

	public void setReconditioningAmount(BigDecimal reconditioningAmount) {
		this.reconditioningAmount = reconditioningAmount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getFeaturedFlag() {
		return featuredFlag != null ? featuredFlag : Boolean.FALSE;
	}

	public void setFeaturedFlag(Boolean featuredFlag) {
		this.featuredFlag = (featuredFlag != null ? featuredFlag : Boolean.FALSE);
	}

	public Boolean getChangeFlag() {
		return changeFlag;
	}

	public void setChangeFlag(Boolean changeFlag) {
		this.changeFlag = changeFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserAdded() {
		return userAdded;
	}

	public void setUserAdded(String userAdded) {
		this.userAdded = userAdded;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getStocknumber() {
		return stocknumber;
	}

	public void setStocknumber(String stocknumber) {
		this.stocknumber = stocknumber;
	}

	public String getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}

	public String getEnginecylinders() {
		return enginecylinders;
	}

	public void setEnginecylinders(String enginecylinders) {
		this.enginecylinders = enginecylinders;
	}

	public String getEnginedisplacement() {
		return enginedisplacement;
	}

	public void setEnginedisplacement(String enginedisplacement) {
		this.enginedisplacement = enginedisplacement;
	}

	public String getEnginedescription() {
		return enginedescription;
	}

	public void setEnginedescription(String enginedescription) {
		this.enginedescription = enginedescription;
	}

	public String getExteriorcolor() {
		return exteriorcolor;
	}

	public void setExteriorcolor(String exteriorcolor) {
		this.exteriorcolor = exteriorcolor;
	}

	public String getInteriorcolor() {
		return interiorcolor;
	}

	public void setInteriorcolor(String interiorcolor) {
		this.interiorcolor = interiorcolor;
	}

	public BigDecimal getInvoiceprice() {
		return invoiceprice;
	}

	public void setInvoiceprice(BigDecimal invoiceprice) {
		this.invoiceprice = invoiceprice;
	}

	public BigDecimal getInternetprice() {
		return internetprice;
	}

	public void setInternetprice(BigDecimal internetprice) {
		this.internetprice = internetprice;
	}

	public String getStandardfeatures() {
		return standardfeatures;
	}

	public void setStandardfeatures(String standardfeatures) {
		this.standardfeatures = standardfeatures;
	}

	public Integer getDaysinstock() {
		return daysinstock;
	}

	public void setDaysinstock(Integer daysinstock) {
		this.daysinstock = daysinstock;
	}

	public String getCaptionComment() {
		return captionComment;
	}

	public void setCaptionComment(String captionComment) {
		this.captionComment = captionComment;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getLoanpaymentlegaltext() {
		return loanpaymentlegaltext;
	}

	public void setLoanpaymentlegaltext(String loanpaymentlegaltext) {
		this.loanpaymentlegaltext = loanpaymentlegaltext;
	}

	
	public Boolean getProtectedFlag() {
		return protectedFlag != null ? protectedFlag : Boolean.FALSE;
	}

	public void setProtectedFlag(Boolean protectedFlag) {
		this.protectedFlag = (protectedFlag != null ? protectedFlag : Boolean.FALSE);
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getPriceChangeDate() {
		return priceChangeDate;
	}

	public void setPriceChangeDate(Date priceChangeDate) {
		this.priceChangeDate = priceChangeDate;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "inventoryMaster") public
	 * Set<Inventoryvehiclefeatures> getInventoryvehiclefeatureses() { return
	 * inventoryvehiclefeatureses; } public void
	 * setInventoryvehiclefeatureses(Set<Inventoryvehiclefeatures>
	 * inventoryvehiclefeatureses) { this.inventoryvehiclefeatureses =
	 * inventoryvehiclefeatureses; }
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "inventoryMaster") public
	 * Set<InventoryVideos> getInventoryVideoses() { return inventoryVideoses; }
	 * public void setInventoryVideoses(Set<InventoryVideos> inventoryVideoses)
	 * { this.inventoryVideoses = inventoryVideoses; }
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "inventoryMaster") public
	 * Set<InventoryDiscrepancyReport> getInventoryDiscrepancyReports() { return
	 * inventoryDiscrepancyReports; } public void
	 * setInventoryDiscrepancyReports(Set<InventoryDiscrepancyReport>
	 * inventoryDiscrepancyReports) { this.inventoryDiscrepancyReports =
	 * inventoryDiscrepancyReports; }
	 */
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != InventoryMaster.class)
			return false;
		InventoryMaster other = (InventoryMaster) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (certified == null) {
			if (other.certified != null)
				return false;
		} else if (!certified.equals(other.certified))
			return false;
		if (cityMpg == null) {
			if (other.cityMpg != null)
				return false;
		} else if (!cityMpg.equals(other.cityMpg))
			return false;
		if (co2 == null) {
			if (other.co2 != null)
				return false;
		} else if (!co2.equals(other.co2))
			return false;
		if (daysForReconditionCar == null) {
			if (other.daysForReconditionCar != null)
				return false;
		} else if (!daysForReconditionCar.equals(other.daysForReconditionCar))
			return false;
		if (daysinstock == null) {
			if (other.daysinstock != null)
				return false;
		} else if (!daysinstock.equals(other.daysinstock))
			return false;
		if (dealerid == null) {
			if (other.dealerid != null)
				return false;
		} else if (!dealerid.equals(other.dealerid))
			return false;
		if (doors == null) {
			if (other.doors != null)
				return false;
		} else if (!doors.equals(other.doors))
			return false;
		if (dsprovider == null) {
			if (other.dsprovider != null)
				return false;
		} else if (!dsprovider.equals(other.dsprovider))
			return false;
		if (enginecylinders == null) {
			if (other.enginecylinders != null)
				return false;
		} else if (!enginecylinders.equals(other.enginecylinders))
			return false;
		if (enginedescription == null) {
			if (other.enginedescription != null)
				return false;
		} else if (!enginedescription.equals(other.enginedescription))
			return false;
		if (enginedisplacement == null) {
			if (other.enginedisplacement != null)
				return false;
		} else if (!enginedisplacement.equals(other.enginedisplacement))
			return false;
		if (exteriorcolor == null) {
			if (other.exteriorcolor != null)
				return false;
		} else if (!exteriorcolor.equals(other.exteriorcolor))
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (geoZoneId == null) {
			if (other.geoZoneId != null)
				return false;
		} else if (!geoZoneId.equals(other.geoZoneId))
			return false;
		if (hasStockPhotos == null) {
			if (other.hasStockPhotos != null)
				return false;
		} else if (!hasStockPhotos.equals(other.hasStockPhotos))
			return false;
		if (hasWarranty == null) {
			if (other.hasWarranty != null)
				return false;
		} else if (!hasWarranty.equals(other.hasWarranty))
			return false;
		if (highwayMpg == null) {
			if (other.highwayMpg != null)
				return false;
		} else if (!highwayMpg.equals(other.highwayMpg))
			return false;
		
		if (interiorcolor == null) {
			if (other.interiorcolor != null)
				return false;
		} else if (!interiorcolor.equals(other.interiorcolor))
			return false;
		if (internetprice == null) {
			if (other.internetprice != null)
				return false;
		} else if (!(internetprice
				.doubleValue() == (other.internetprice != null ? other.internetprice.doubleValue() : 0.0)))
			return false;
		if (invoiceprice == null) {
			if (other.invoiceprice != null)
				return false;
		} else if (!(invoiceprice
				.doubleValue() == (other.invoiceprice != null ? other.invoiceprice.doubleValue() : 0.0)))
			return false;
		if (featuredFlag == null) {
			if (other.featuredFlag != null)
				return false;
		} else if (!featuredFlag.equals(other.featuredFlag))
			return false;
		if (loanpaymentlegaltext == null) {
			if (other.loanpaymentlegaltext != null)
				return false;
		} else if (!loanpaymentlegaltext.equals(other.loanpaymentlegaltext))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (mileage == null) {
			if (other.mileage != null)
				return false;
		} else if (!mileage.equals(other.mileage))
			return false;
		if (mixedMpg == null) {
			if (other.mixedMpg != null)
				return false;
		} else if (!mixedMpg.equals(other.mixedMpg))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (modelnumber == null) {
			if (other.modelnumber != null)
				return false;
		} else if (!modelnumber.equals(other.modelnumber))
			return false;
		if (monthlyLoanPayment == null) {
			if (other.monthlyLoanPayment != null)
				return false;
		} else if (!(monthlyLoanPayment
				.doubleValue() == (other.monthlyLoanPayment != null ? other.monthlyLoanPayment.doubleValue() : 0.0)))
			return false;
		if (msrp == null) {
			if (other.msrp != null)
				return false;
		} else if (!(msrp.doubleValue() == (other.msrp != null ? other.msrp.doubleValue() : 0.0)))
			return false;
		if (inventoryType == null) {
			if (other.inventoryType != null)
				return false;
		} else if (!inventoryType.equals(other.inventoryType))
			return false;
		if (numberOfImages == null) {
			if (other.numberOfImages != null)
				return false;
		} else if (!numberOfImages.equals(other.numberOfImages))
			return false;
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (powerForTaxes == null) {
			if (other.powerForTaxes != null)
				return false;
		} else if (!powerForTaxes.equals(other.powerForTaxes))
			return false;
		if (realEnginePower == null) {
			if (other.realEnginePower != null)
				return false;
		} else if (!realEnginePower.equals(other.realEnginePower))
			return false;
		if (reconditioningAmount == null) {
			if (other.reconditioningAmount != null)
				return false;
		} else if (!(reconditioningAmount.doubleValue() == (other.reconditioningAmount != null
				? other.reconditioningAmount.doubleValue() : 0.0)))
			return false;
		if (registrationdate == null) {
			if (other.registrationdate != null)
				return false;
		} else if (!registrationdate.equals(other.registrationdate))
			return false;
		if (reservedUntil == null) {
			if (other.reservedUntil != null)
				return false;
		} else if (!reservedUntil.equals(other.reservedUntil))
			return false;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		if (standardfeatures == null) {
			if (other.standardfeatures != null)
				return false;
		} else if (!standardfeatures.equals(other.standardfeatures))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (stocknumber == null) {
			if (other.stocknumber != null)
				return false;
		} else if (!stocknumber.equals(other.stocknumber))
			return false;
		if (transmission == null) {
			if (other.transmission != null)
				return false;
		} else if (!transmission.equals(other.transmission))
			return false;
		if (transmissionSpeeds == null) {
			if (other.transmissionSpeeds != null)
				return false;
		} else if (!transmissionSpeeds.equals(other.transmissionSpeeds))
			return false;
		if (trim == null) {
			if (other.trim != null)
				return false;
		} else if (!trim.equals(other.trim))
			return false;
		if (userAdded == null) {
			if (other.userAdded != null)
				return false;
		} else if (!userAdded.equals(other.userAdded))
			return false;
		if (userUpdated == null) {
			if (other.userUpdated != null)
				return false;
		} else if (!userUpdated.equals(other.userUpdated))
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		if (changeFlag == null) {
			if (other.changeFlag != null)
				return false;
		} else if (!changeFlag.equals(other.changeFlag))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (vehicleType == null) {
			if (other.vehicleType != null)
				return false;
		} else if (!vehicleType.equals(other.vehicleType))
			return false;
		if (priceChangeDate == null) {
			if (other.priceChangeDate != null)
				return false;
		} else if (!priceChangeDate.equals(other.priceChangeDate))
			return false;
		if (soldDate == null) {
			if (other.soldDate != null)
				return false;
		} else if (!soldDate.equals(other.soldDate))
			return false;
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
			return false;
		if (yearFrom == null) {
			if (other.yearFrom != null)
				return false;
		} else if (!yearFrom.equals(other.yearFrom))
			return false;
		if (yearTo == null) {
			if (other.yearTo != null)
				return false;
		} else if (!yearTo.equals(other.yearTo))
			return false;
		return true;
		
	}

	public InventoryMaster(Integer year, String make, String model, String trim, String fuelType,
			 String vehicleType, String body, Integer daysinstock, Long mileage, String status ) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.trim = trim;
		this.fuelType = fuelType;
		this.vehicleType = vehicleType;
		this.body = body;
		this.daysinstock = daysinstock;
		this.mileage = mileage;
		this.status = status;
	}

	

	@Override
	public String toString() {
		return "InventoryMaster [year=" + year + " make=" + make + ", model=" + model + ", trim=" + trim + ", fuelType=" + fuelType
				+ ", vehicleType=" + vehicleType +  ", body=" + body +  ", body=" + body +  ", daysinstock=" + daysinstock +  ", mileage=" + mileage +  ", status=" + status + ", discount=" + discount +"]";
	}

	public Integer getDiscount() {
		return (discount == null ? 0 : discount);
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getYearFrom() {
		return getYearFrom();
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
	
}
