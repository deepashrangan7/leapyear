package com.main;

import java.util.Scanner;

import com.service.LeapYearService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeapYearService leapYearService = new LeapYearService();
		System.out.println("Enter the year \n");
		try {
			int year = sc.nextInt();
			boolean flag = leapYearService.isLeapYear(year);
			if (flag)
				System.out.println(year + " is a leap year");
			else
				System.out.println(year + " is not a leap year");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
