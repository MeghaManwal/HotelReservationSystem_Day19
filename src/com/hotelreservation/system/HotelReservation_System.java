package com.hotelreservation.system;

import java.util.Scanner;

public class HotelReservation_System {
	
	private Hotels a, b, c;
	
	public void setHotelDetails() {
		Scanner s= new Scanner(System.in);
	
		a= new Hotels("LakeWood");
		a.setRegularWeekDay(110);
		a.setRegularWeekEnd(90);
		
		b = new Hotels("BridgeWood");
		b.setRegularWeekDay(160);
		b.setRegularWeekEnd(60);
		
		c = new Hotels("RidgeWood");
		c.setRegularWeekDay(220);
		c.setRegularWeekEnd(150);
		
		System.out.println("Enter the Date");
		String date = s.next();
		
		int cost_a=0;
		int cost_b=0;
		int cost_c=0;
		int day_index_start = 0;
		int day_index_end = 0;
		
		while(day_index_start != -1) {
			day_index_start = date.indexOf("(", day_index_start + 1);
            day_index_end = date.indexOf(")", day_index_end + 1);
            
            if(day_index_start != -1) {
            	String day = date.substring(day_index_start + 1, day_index_end);
            	if(day.equalsIgnoreCase("sun") || day.equalsIgnoreCase("sat")) {
            		cost_a += a.getRegularWeekEnd();
            		cost_b += b.getRegularWeekEnd();
            		cost_c += c.getRegularWeekEnd();
            	}
            }else {
            	cost_a += a.getRegularWeekDay();
        		cost_b += b.getRegularWeekDay();
        		cost_c += c.getRegularWeekDay();
            }  
		}
		
		System.out.println(cost_a);
		System.out.println(cost_b);
		System.out.println(cost_c);
		
		String result = min(cost_a, cost_b, cost_c);
		System.out.println(result);
	}
	
	public  String min(int x, int y, int z) {
		if(x<y && x<z) {
			return a.getHotelName();
		}else if(y<x && y<z) {
			return b.getHotelName();
		}else {
			return c.getHotelName();
		}	
	}
	
	public static void main(String[] args) {
		HotelReservation_System system = new HotelReservation_System();
		system.setHotelDetails();
	}

}
