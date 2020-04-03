package com.project;

public strictfp class A 
{
	
	public void m1()
	{
		System.out.println("iam m1 from Class A");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
	}

}
