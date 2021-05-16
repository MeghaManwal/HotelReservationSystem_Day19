package com.hotelreservation.system;

public class Hotels {

	private String hotelName;
	private int regularWeekDay;
	private int regularWeekEnd;
	private int ratings;
	private int rewardeeWeekDay;
        private int rewardeeWeekEnd;
	
	
	public Hotels() {	
	}
	
	public int getRewardeeWeekDay() {
		return rewardeeWeekDay;
	}

	public void setRewardeeWeekDay(int rewardeeWeekDay) {
		this.rewardeeWeekDay = rewardeeWeekDay;
	}

	public int getRewardeeWeekEnd() {
		return rewardeeWeekEnd;
	}

	public void setRewardeeWeekEnd(int rewardeeWeekEnd) {
		this.rewardeeWeekEnd = rewardeeWeekEnd;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
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
