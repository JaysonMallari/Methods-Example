package com.renz.methodsAvg;
/*
 * @ Jayson Mallari
 */

	import java.util.Scanner;
public class methodsAvg {
	
	public static void main(String[] args){
		double num1,num2,num3,avg;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		num3 = in.nextDouble();
		avg = average(num1,num2,num3);
		
		System.out.println("The avegrage number is "+avg);
		
	}
	
	public static double average(double num1, double num2, double num3){
		double avg = (num1+num2+num3)/3;
		
		return avg;
	}
	
}
