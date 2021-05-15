package com.hotelreservation.system;

public class HotelReservation_System {
	
	
	public void setHotelDetails() {
		System.out.println("Hotels and their Prices for Regular Customer \n");
		Hotels hotel = new Hotels();
		
		hotel.setHotelName("LakeWood");
		hotel.setRegularWeekDay(110);
		hotel.setRegularWeekEnd(90);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getRegularWeekEnd()+"\n");
		
		hotel.setHotelName("BridgeWood");
		hotel.setRegularWeekDay(160);
		hotel.setRegularWeekEnd(60);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getRegularWeekEnd()+"\n");
		
		hotel.setHotelName("RidgeWood");
		hotel.setRegularWeekDay(220);
		hotel.setRegularWeekEnd(150);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getRegularWeekEnd()+"\n");
			
	}
	
	public static void main(String[] args) {
		HotelReservation_System system = new HotelReservation_System();
		system.setHotelDetails();
	}

}
