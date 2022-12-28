package com.example.implementationHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class DateMethods
{

	public static LocalDate dateGenerator() 
	{
		Random random = new Random();
		int minDay = (int) LocalDate.of(1960, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2022, 6, 1).toEpochDay();

		int a = 0;
		a = maxDay - minDay;
		a = Math.abs(a);
		long randomDay = minDay + random.nextInt(a + 1);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);// dateOfBirth
		return randomBirthDate;
	}

	public static LocalDate dateGenerator(int yy, int mm, int dd)
	{
		Random random = new Random();
		int minDay = (int) LocalDate.of(yy, mm, dd).toEpochDay();
		int maxDay = (int) LocalDate.of(2022, 6, 1).toEpochDay();

		minDay = Math.abs(minDay);
		maxDay = Math.abs(maxDay);
		minDay = Math.abs(minDay);
		int a = 0;
		a = maxDay - minDay;
		a = Math.abs(a);
		int randomDay = Math.abs(minDay) + random.nextInt((a + 1));
		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return randomBirthDate;
	}

	public static LocalDate dateGenerator4(int y1, int m1, int d1, int y2, int m2, int d2)
	{
		Random random = new Random();
		int minDay = (int) LocalDate.of(y1, m1, d1).toEpochDay();
		int maxDay = (int) LocalDate.of(y2, m2, d2).toEpochDay();
		int a = 0;
		a = maxDay - minDay;
		a = Math.abs(a);
		long randomDay = minDay + random.nextInt(a + 1);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return randomBirthDate;	
	}

	public static String dateGenerator2() 
	{
		String s = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
		return s;
	}

	public static String dateGenerator3() 
	{
		String s = new SimpleDateFormat("yyyyMMdd").format(new Date());
		return s;
	}

}
