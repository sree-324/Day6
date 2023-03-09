package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Day_6")
public class child {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int babyid;
	
	private String babyFirstName;
	
	private String babyLastName;
	
	private String FatherName;
	
	private String MotherName;
	
	private String address;

	public int getBabyid() {
		return babyid;
	}

	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}

	public String getBabyFirstName() {
		return babyFirstName;
	}

	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}

	public String getBabyLastName() {
		return babyLastName;
	}

	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public child(int babyid, String babyFirstName, String babyLastName, String fatherName, String motherName,
			String address) {
		super();
		this.babyid = babyid;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		FatherName = fatherName;
		MotherName = motherName;
		this.address = address;
	}
	
	public child()
	{
		
	}
	
}
