package com.gladys.githubrefresher;

//Public class
public class Main {
	
	//Main method
	public static void main (String...args){
		//print to the standard output
		System.out.println("Hello World, Hi from Gladys");
	}
	
	//Added test method to test getSum method
	public static void getSumTest(){
		assertTrue (getSum(1,1),2);
	}
	
	public static int getSum(int number1, int number2){
		return number1 + number2;
	}

	public static int getDifference(int number1, int number2){
		return number1 - number2;
	}
	public static void getDifferenceTest(){
		assertTrue(getDifference(1,1),0);
	}
	public static int getProduct(int number1, int number2){
		return number1 * number2;
	}
	public static void getProductTest(){
		assertTrue(getDifference(1,1),1);
	}
	public static int getRemainder(int number1, int number2){
		return number1 % number2;
	}
	public static void getRemainderTest(){
		assertTrue(getRemainder(2,1),0);
	}
} 
