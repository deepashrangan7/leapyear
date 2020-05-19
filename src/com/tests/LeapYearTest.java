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
	public void testLeapYearDividyBy100NotBy400() {
		assert (false);
	}

	@Test
	public void testLeapYearDividyBy100AndBy400() {
		assert (false);
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
