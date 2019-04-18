//Arman Uddin
//CSC 221 Section P
//Assignment 1

import java.util.Scanner;

public class HeartRatesTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Please enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Please enter your date of birth (mm-dd-yyyy): ");
		String DOB = input.nextLine();
		int day = 0;
		int month = 0;
		int year = 0;
		try {
			month = Integer.parseInt(DOB.substring(0, 2));
			day = Integer.parseInt(DOB.substring(3, 5));
			year = Integer.parseInt(DOB.substring(6, 10));
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			e.printStackTrace();
			System.exit(0);
		}
		input.close();
		HeartRates hr = new HeartRates(firstName,lastName,day,month,year);
		System.out.println("Name: "+hr.getFirstName()+" "+hr.getLastName());
		hr.printDateOfBirth();
		System.out.println("Age: "+hr.getAge());
		System.out.println("Maximum Heart Rate(Beats per Minute): "+hr.maxHeartRate());
		System.out.println(hr.targetHeartRate());
		
	}
	
}
