package com.tests;

import org.junit.Test;

import com.service.LeapYearService;

public class LeapYearTest {
	LeapYearService leapYearService = new LeapYearService();

	@Test
	public void testLeapYearDivideBy400() {
		boolean flag = leapYearService.isDivisibleBy400(4000);
		if (flag)
			assert (true);
		else
			assert (false);
	}

	@Test
	public void testLeapYearNotDivideBy400() {
		boolean flag = leapYearService.isDivisibleBy400(4103);
		if (!flag)
			assert (true);
		else
			assert (false);
	}

	@Test
	public void testLeapYearDividyBy100AndBy400() {
		boolean flag = leapYearService.isDivisibleBy100AndBy400(2000);
		if (flag)
			assert (true);
		else
			assert (false);

	}

	@Test
	public void testLeapYearDividyBy100AndNotBy400() {
		boolean flag = leapYearService.isDivisibleBy100AndBy400(2100);
		if (!flag)
			assert (true);
		else
			assert (false);

	}

	@Test
	public void testLeapYearDividyBy4AndNotBy100() {

		boolean flag = leapYearService.isDivisibleBy4AndNotBy100(2020);
		if (flag)
			assert (true);
		else
			assert (false);

	}

	@Test
	public void testLeapYearDivideBy4AndBy100() {

		boolean flag = leapYearService.isDivisibleBy4AndNotBy100(2300);
		if (!flag)
			assert (true);
		else
			assert (false);

	}

	@Test
	public void testLeapYearNotDivideBy4() {
		boolean flag = leapYearService.isDivisibleBy4(2000);
		if (flag)
			assert (true);
		else
			assert (false);
	}
	
	@Test
	public void isLeapYear() {
		boolean flag = leapYearService.isLeapYear(2000);
		if (flag)
			assert (true);
		else
			assert (false);
	}
	@Test
	public void isNotLeapYear() {
		boolean flag = leapYearService.isLeapYear(2300);
		if (!flag)
			assert (true);
		else
			assert (false);
	}
	
}
