package com.testingdocs.calculator;

import java.util.Scanner;

public class Calculator {
	public Calculator()
	{
		
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		return a/b;
	}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
}
}
	