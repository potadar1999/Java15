package com.que4;

public class CheckOutput {
	public static void main(String args[])
	{
	try
	{
	System.out.print("A");
	int num = 99/0;
	System.out.print("B");
	}
	catch(ArithmeticException ex)
	{
	System.out.print("C");
	}
	catch(Exception ex)
	{
	System.out.print("D");
	}
	System.out.print("E");
	}

	
}


//Output Will ACE means logicError in line num12 Arithmetic Exception E means End of Output