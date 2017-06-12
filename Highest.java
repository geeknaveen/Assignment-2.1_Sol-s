package asst2_1;

import java.util.Scanner;

public class Highest {

	private static Scanner s;

	public static void main(String[] args) 
	{
	int a,b,c;
	s = new Scanner(System.in);
	System.out.println("Please Enter three distinct numbers: ");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
{
	if(a>=b && a>=c) 
	{
	System.out.println("Highest number is : "+a);
	}
	else if(b>=a && b>=c) 
	{
	System.out.println("Highest number is : "+b);
	}
	else
	{
	System.out.println("Highest number is : "+c);
	}
	}
	}}