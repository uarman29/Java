import java.util.Scanner;

public class CheckProtection 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an amount less than $100,000");
		
		String entered = input.nextLine();
		double value = 0;
		int digitsAfterDecimal = 0;
		
		try 
		{
			//Removes commas so input can be parsed
			if(entered.contains(","))
			{
				entered = entered.replaceFirst(",","");
			}
			
			//Attempts to parse the input
			value = Double.parseDouble(entered);
			//Checks if input is within the valid range
			if(value >= 100000)
			{
				System.err.println("Invalid Input");
				return;
			}
			
			//Adds commas
			if(value >= 10000)
			{
				entered = entered.substring(0,2)+","+entered.substring(2,entered.length());
			}
			else if(value >= 1000)
			{
				entered = entered.substring(0,1)+","+entered.substring(1,entered.length());
			}
			
			//Adds decimal
			if(!entered.contains("."))
			{
				entered += ".00";
			}
			
			//Fixes number of digits after decimal
			if(entered.contains("."))
			{
				digitsAfterDecimal = (entered.length()-1)-entered.indexOf(".");
				while(digitsAfterDecimal != 2)
				{
					entered += "0";
					digitsAfterDecimal++;
				}
			}
			
			//Adds asterisks if needed
			while(entered.length() != 9)
			{
				entered = "*"+entered;
			}
			System.out.println(entered);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Invalid Input");
		}
		finally
		{
			input.close();
		}
	}
}
