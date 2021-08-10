package com.kosa.myapp;

import java.sql.Date;

public class VacVO {
	private String vacType;
	private java.sql.Date prodDate;
	private String producer;
	private String rotNum;
	
	public String getVacType() {
		return vacType;
	}
	public void setVacType(String vacType) {
		this.vacType = vacType;
	}
	public java.sql.Date getProdDate() {
		return prodDate;
	}
	public void setProdDate(java.sql.Date prodDate) {
		this.prodDate = prodDate;
	}
	public String getPrducer() {
		return producer;
	}
	public void setPrducer(String prducer) {
		this.producer = prducer;
	}
	public String getRotNumber() {
		return rotNum;
	}
	public void setRotNumber(String rotNumber) {
		this.rotNum = rotNumber;
	}
	@Override
	public String toString() {
		return "VacVO [vacType=" + vacType + ", prodDate=" + prodDate + ", prducer=" + producer + ", rotNumber="
				+ rotNum + "]";
	}
	
	
}
