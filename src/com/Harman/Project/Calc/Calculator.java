package com.Harman.Project.Calc;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Addition obj=new Addition();
	Subtraction obj1=new Subtraction();
	Multiplication obj2=new Multiplication();
	Division obj3=new Division();
	int x,y,z;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x");

	x=sc.nextInt();
	System.out.println("Enter y");
	y=sc.nextInt();
	
	int show1=obj.addnum(x,y);
	int show2=obj1.subnum(x,y);
	int show3=obj2.mulnum(x,y);
	int show4=obj3.divnum(x, y);
	
	System.out.println(show1);
	System.out.println(show2);
	System.out.println(show3);
	System.out.println(show4);
	
}
}
