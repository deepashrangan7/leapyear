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
			assert(false);
	}
	@Test
	public void testLeapYearNotDivideBy400() {
		boolean flag = leapYearService.isDivisibleBy400(4103);
		if (!flag)
			assert (true);
		else
			assert(false);
	}
	@Test
	public void testLeapYearDividyBy100AndBy400() {
		boolean flag = leapYearService.isDivisibleBy100AndBy400(2000);
		if(flag)
			assert(true);
		else
			assert(false);
	
	}
	@Test
	public void testLeapYearDividyBy100AndNotBy400() {
		boolean flag = leapYearService.isDivisibleBy100AndBy400(2100);
		if(!flag)
			assert(true);
		else
			assert(false);
	
	}

	@Test
	public void testLeapYearDividyBy4AndNotBy100() {
		assert (false);
	}

	@Test
	public void testLeapYearDividyBy4AndBy100() {
		assert (false);
	}

	@Test
	public void testLeapYearNotDivideBy4() {
		assert (false);
	}

}
