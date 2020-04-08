package com.project;


public class B extends A
{
	public void m2()
	{
		System.out.println("iam m2 from Class B");
	}
	
	public static void main(String[] args) 
	{
		B b= new B();
		b.m2();
		b.m1();
	}
	
}
