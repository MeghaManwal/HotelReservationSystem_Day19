package com.hotelreservation.system;

public class Hotels {

	private String hotelName;
	private int regularWeekDay;
	private int regularWeekEnd;
	
	public Hotels() {
		
	}
	
	Hotels(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public int getRegularWeekDay() {
		return regularWeekDay;
	}
	public void setRegularWeekDay(int regularWeekDay) {
		this.regularWeekDay = regularWeekDay;
	}
	
	public int getRegularWeekEnd() {
		return regularWeekEnd;
	}
	public void setRegularWeekEnd(int regularWeekEnd) {
		this.regularWeekEnd = regularWeekEnd;
	}
	
	
}
