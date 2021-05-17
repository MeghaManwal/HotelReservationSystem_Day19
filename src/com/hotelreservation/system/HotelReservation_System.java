package com.hotelreservation.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HotelReservation_System {
	
	private Hotels a, b, c;
	
	public void setHotelDetails() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("HOTELS AND THEIR INFORMATIONS \n");
		a= new Hotels("LakeWood");
		a.setRegularWeekDay(110);
		a.setRegularWeekEnd(90);
		a.setRewardeeWeekDay(80);
		a.setRewardeeWeekEnd(80);
		a.setRatings(3);
		System.out.println("HotelName: "+ a.getHotelName()+"\n"+"Regular WeekDay Price: "+a.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+a.getRegularWeekEnd()+"\n"+
		                   "Reward WeekDay Price: "+a.getRewardeeWeekDay()+"\n"+"Reward WeekEnd Price: "+a.getRewardeeWeekEnd()+"\n"+"Ratings:"+a.getRatings()+"\n");
		
		
		b = new Hotels("BridgeWood");
		b.setRegularWeekDay(160);
		b.setRegularWeekEnd(40);
		b.setRewardeeWeekDay(110);
		b.setRewardeeWeekEnd(50);
		b.setRatings(4);
		System.out.println("HotelName: "+ b.getHotelName()+"\n"+"Regular WeekDay Price: "+b.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+b.getRegularWeekEnd()+"\n"+
                                   "Reward WeekDay Price: "+b.getRewardeeWeekDay()+"\n"+"Reward WeekEnd Price: "+b.getRewardeeWeekEnd()+"\n"+"Ratings:"+b.getRatings()+"\n");
		
		c = new Hotels("RidgeWood");
		c.setRegularWeekDay(220);
		c.setRegularWeekEnd(150);
		c.setRewardeeWeekDay(100);
		c.setRewardeeWeekEnd(40);
		c.setRatings(5);
		System.out.println("HotelName: "+ c.getHotelName()+"\n"+"Regular WeekDay Price: "+c.getRegularWeekDay()+"\n"+"Regular WeekEnd Price: "+c.getRegularWeekEnd()+"\n"+
                                   "Reward WeekDay Price: "+c.getRewardeeWeekDay()+"\n"+"Reward WeekEnd Price: "+c.getRewardeeWeekEnd()+"\n"+"Ratings:"+c.getRatings()+"\n");
        
		System.out.println("Enter the Date with Customer type");
		String date = bf.readLine();
		dateValidation(date);
		if(dateValidation(date) == true) {
		 
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
            	       if(day.equalsIgnoreCase("sun") || day.equalsIgnoreCase("sat")) {
            	    	   if (type.equalsIgnoreCase("regular")) { 
            		      cost_a += a.getRegularWeekEnd();
            		      cost_b += b.getRegularWeekEnd();
            		      cost_c += c.getRegularWeekEnd();
            	    	   }else {
            	    	      cost_a += a.getRewardeeWeekEnd();
                              cost_b += b.getRewardeeWeekEnd();
                              cost_c += c.getRewardeeWeekEnd();
            	    	   }
            	        }
                        else {
                    	   if (type.equalsIgnoreCase("regular")) {
            	               cost_a += a.getRegularWeekDay();
        		       cost_b += b.getRegularWeekDay();
        		       cost_c += c.getRegularWeekDay();
                    	   }else {
                    	       cost_a += a.getRewardeeWeekEnd();
                               cost_b += b.getRewardeeWeekEnd();
                               cost_c += c.getRewardeeWeekEnd();
                    	   }
                        }  
		    }
		}

		System.out.println(cost_a);
		System.out.println(cost_b);
		System.out.println(cost_c);
		
		int result = Stream.of(cost_a, cost_b, cost_c)
			     .min(Comparator.comparing(Integer::valueOf))
			     .get();
		System.out.println("CheapestPrice: "+result+"$");
		
		String finalresult = compare(result, cost_a, cost_b, cost_c);
		System.out.println(finalresult);
		
	        }else
		 System.out.println("Invalid Input! Please Provide Valid input");
	}
	
	public  String compare( int result, int x, int y, int z) {
		
	    if(result==x && result==y) {
			return "Hotel:"+b.getHotelName()+", Rating:"+b.getRatings()+" And Total Rates:"+ y+"$";
		}else if(result==x && result==z) {
			return "Hotel:"+c.getHotelName()+", Rating:"+c.getRatings()+" And Total Rates:"+ z+"$";
		}else if(result == x) {
			return "Hotel:"+a.getHotelName()+", Rating:"+a.getRatings()+" And Total Rates:"+ x+"$";	
		}else if(result==y && result==z) {
			return "Hotel:"+c.getHotelName()+", Rating:"+c.getRatings()+" And Total Rates:"+ z+"$";
		}else if( result==y) { 
			return "Hotel:"+b.getHotelName()+", Rating:"+b.getRatings()+" And Total Rates:"+ y+"$";	
		}else {
			return "Hotel:"+c.getHotelName()+", Rating:"+c.getRatings()+" And Total Rates:"+ z+"$";
		}
			
	}
	
	public boolean dateValidation(String date) {
		String pattern1="^[A-Z a-z]{1,}[:][0-9]{1,}[A-Z a-z]{3,}[1-9]{1}[0-9]{3}[(][A-Z a-z]{3}[)][,][0-9]{1,}[A-Z a-z]{3,}[1-9]{1}[0-9]{3}[(][A-Z a-z]{3}[)]$";
		Pattern P=Pattern.compile(pattern1);
                Matcher m=P.matcher(date);
                return m.matches();	
		
	}
	
	public static void main(String[] args) throws IOException {
		HotelReservation_System system = new HotelReservation_System();
		system.setHotelDetails();
	}

}
