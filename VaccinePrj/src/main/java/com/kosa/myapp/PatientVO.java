package com.kosa.myapp;

import java.sql.Date;

public class PatientVO {
	private String name;
	private String birthDate;
	private String phoneNum;
	private String gender;
	private String rotNum;
	private String firstDose;
	private String secondDose;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRotNum() {
		return rotNum;
	}
	public void setRotNum(String rotNum) {
		this.rotNum = rotNum;
	}
	public String getFirstDose() {
		return firstDose;
	}
	public void setFirstDose(String firstDose) {
		this.firstDose = firstDose;
	}
	public String getSecondDose() {
		return secondDose;
	}
	public void setSecondDose(String secondDose) {
		this.secondDose = secondDose;
	}
	
	@Override
	public String toString() {
		return "PatientVO [name=" + name + ", birthDate=" + birthDate + ", phoneNum=" + phoneNum + ", gender=" + gender
				+ ", rotNum=" + rotNum + ", firstDose=" + firstDose + ", secondDose=" + secondDose + "]";
	}
	
	
}
