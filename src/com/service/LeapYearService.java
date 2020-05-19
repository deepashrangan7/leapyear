package com.service;

public class LeapYearService {

	public boolean isLeapYear(int year) {
		boolean flag = false;
		if (isDivisibleBy100AndBy400(year) && isDivisibleBy400(year))
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

}
