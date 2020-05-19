package com.service;

public class LeapYearService {

	public boolean isLeapYear(int year) {
		boolean flag = false;

		return flag;
	}

	public boolean isDivisibleBy400(int year) {
		boolean flag = false;
		if (year % 400 == 0)
			flag = true;
		return flag;
	}
}
