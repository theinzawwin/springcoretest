package com.springcore.model;

public class Person {

	private String name;
	public Person(String name, String phoneNo, String nrc, Address address) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.nrc = nrc;
		this.address = address;
	}
	public Person() {
		
	}
	private String phoneNo;
	private String nrc;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showAddress() {
		System.out.println(address.toString());
	}
	
	public void showInfo() {
		System.out.println("Name:"+name);
		System.out.println("Phone NO :"+phoneNo);
		System.out.println("Nrc: "+nrc);
		showAddress();
	}
	
}
