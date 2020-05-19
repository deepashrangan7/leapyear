package com.service;

public class LeapYearService {

	public boolean isLeapYear(int year) {
		boolean flag = false;
		if (isDivisibleBy4(year)&& isDivisibleBy4AndNotBy100(year) && isDivisibleBy100AndBy400(year) && isDivisibleBy400(year) && isDivisibleBy4AndNotBy100(year))
			flag = true;
		return flag;
	}

	public boolean isDivisibleBy400(int year) {
		boolean flag = false;
		if (year % 400 == 0)
			flag = true;
		return flag;
	}

	public boolean isDivisibleBy100AndBy400(int year) {
		boolean flag = false;
		if (year % 100 == 0 && year % 400 == 0)
			flag = true;
		return flag;
	}
	
	public boolean isDivisibleBy4AndNotBy100(int year) {
		boolean flag = false;
		if (year % 4 == 0 && year % 100 != 0)
			flag = true;
		return flag;
	}
	public boolean isDivisibleBy4(int year) {
		boolean flag = false;
		if (year % 4 == 0)
			flag = true;
		return flag;
	}
	
}
