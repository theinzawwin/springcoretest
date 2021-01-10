package com.springcore.model;

public class Address {

	private String street;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	private String buildingNo;
	private String zipCode;
	public Address() {
		super();
	}
	public Address(String street, String buildingNo, String zipCode) {
		super();
		this.street = street;
		this.buildingNo = buildingNo;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Street="+street+"\n Building No= "+buildingNo+"\n Zip Code="+zipCode;
	}
	
	
}
