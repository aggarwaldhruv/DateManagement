package com.DateManagement;

public class Date {

	private int day;
	private int month;
	private int year;
	public void setDay(int day) {
		if(day>0 && day <32){
			this.day = day;
		}else {
			this.day = 1;
		}
	}
	
	public void setMonth(int month) {
		if(month>0 && month <13){
			this.month = month;
		}else {
			this.month = 1;
		}
	}
	public void setYear(int year) {
		if(year>1899 && year <2021){
			this.year = year;
		}else {
			this.year = 1900;
		}
	}
	
	
	public String printDate() {
		return "Date : " + day + " / " + month + " / " + String.valueOf(year).substring(2);
	}
	
	
}
