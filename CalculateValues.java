package com.louis;

public class CalculateValues {

	public int result = 0;
	
	public CalculateValues(int a, int b, int c) throws MyException {
		if(a > 100) {
			throw new MyException(a);		
		} else {
		result = a+b+c;
		}
			
	}
	
	public void displayCal() {
		System.out.println("Calculated output is: "+result);
		
	}
}
