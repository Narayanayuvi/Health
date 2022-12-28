package com.example.implementationHelper;

import java.util.Random;

public class StringGenerationMethod 
{

	public static String getRandomNumberString()
	{
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		return String.format("%06d", number);
	}

	public static String getRandomNumberString4() 
	{

		Random rnd = new Random();
		int number = rnd.nextInt(9999);
		return String.format("%04d", number);
	}

	public static String getRandomNumberString5() 
	{

		Random rnd = new Random();
		int number = rnd.nextInt(99999);
		return String.format("%05d", number);
	}

	public static String getRandomNumberString7()
	{
		Random rnd = new Random();
		int number = rnd.nextInt(9999999);
		return String.format("%07d", number);
	}

	public static String getRandomNumberString9() 
	{
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);
		return String.format("%09d", number);
	}

	public static int getRandomNumber(int min, int max)
	{
		return (int) ((Math.random() * (max - min)) + min);
	}
}
