package com.gladys.githubrefresher;

//Public class
public class Main {
	
	//Main method
	public static void main (String...args){
		//print to the standard output
		System.out.println("Hello World, Hi from Gladys");
	}
	
	//Added test method to test getSum method
	public static int getSumTest(){
		assertTrue (getSum(1,1),2);
	}
	
	public static int getSum(int number1, int number2){
		return number1 + number2;
	}

	public static int getDifference(int number1, int number2){
		return number1 - number2;
	}
	public static int getDifferenceTest(){
		assertTrue(getDifference(1,1),0);
	}

} 
