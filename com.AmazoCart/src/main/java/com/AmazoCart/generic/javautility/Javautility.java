package com.AmazoCart.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Javautility {
	public int getRandomNumber() {
		Random ranDom = new Random();
		int ranDomNumber = ranDom.nextInt(5000);
		return ranDomNumber;
	}
	
	public String getSystemDataYYYYDDMM() {
		Date dateObj = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String date = sdf.format(dateObj);
		return date;
	}
	public String getRequiredDateYYYYDDMM (int days) {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days); 
		String reqDate = sim.format(cal.getTime());
		return reqDate;
	}
}