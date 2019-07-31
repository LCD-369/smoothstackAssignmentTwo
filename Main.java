package com.louis;

import java.util.Scanner;

public class Main {
	
	private static Scanner in;
	

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int first = in.nextInt();
		System.out.println("Enter second value: ");
		int second = in.nextInt();
		System.out.println("Enter third value: ");
		int third = in.nextInt();
		
		CalculateValues c =null;
		try {
			c = new CalculateValues(first, second, third);
		} catch (MyException e) {
			
			System.out.println(e);
		}
		c.displayCal();
		
	}

}
