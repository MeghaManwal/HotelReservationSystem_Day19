package com.hotelreservation.system;

import java.util.Scanner;

public class HotelReservation_System {
	
	private Hotels a, b, c;
	
	public void setHotelDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Date with Customer type");
    	        String date=sc.next();
    	
		a= new Hotels("LakeWood");
		a.setRegularWeekDay(110);
		a.setRegularWeekEnd(90);
		a.setRatings(3);
		
		b = new Hotels("BridgeWood");
		b.setRegularWeekDay(160);
		b.setRegularWeekEnd(40);
		b.setRatings(4);
		
		c = new Hotels("RidgeWood");
		c.setRegularWeekDay(220);
		c.setRegularWeekEnd(150);
		c.setRatings(5);

		int index = date.indexOf(":");
                String type = date.substring(0, index);
		
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
            	     if (type.equalsIgnoreCase("regular")) {
            	       if(day.equalsIgnoreCase("sun") || day.equalsIgnoreCase("sat")) {
            		      cost_a += a.getRegularWeekEnd();
            		      cost_b += b.getRegularWeekEnd();
            		      cost_c += c.getRegularWeekEnd();
            	       }
                       else {
            	              cost_a += a.getRegularWeekDay();
        		      cost_b += b.getRegularWeekDay();
        		      cost_c += c.getRegularWeekDay();
                       } 
                     } 
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
			return "Hotel: "+a.getHotelName()+" Rating: "+a.getRatings()+" Total Price:"+ x+"$";
		}else if(y<x && y<z) {
			return "Hotel: "+b.getHotelName()+" Rating: "+b.getRatings()+" Total Price:"+ y+"$";
		}else if(z<x && z<y) {
			return "Hotel: "+c.getHotelName()+" Rating: "+c.getRatings()+" Total Price:"+ z+"$";
		}else if(x==y || y==z) {
			return "Hotel: "+b.getHotelName()+" Rating: "+b.getRatings()+" Total Price:"+ y+"$";
		}else if(z==x) { 
			return "Hotel: "+c.getHotelName()+" Rating: "+c.getRatings()+" Total Price:"+ z+"$";
		}else {
			return "Hotel: "+a.getHotelName()+" Rating: "+a.getRatings()+" Total Price:"+ x+"$";
		}
			
	}
	
	public static void main(String[] args) {
		HotelReservation_System system = new HotelReservation_System();
		system.setHotelDetails();
	}

}
