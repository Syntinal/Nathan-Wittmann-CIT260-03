/************************************************
* Assignment 1-2
* Convert Gallons to Liters into a table
* Author: Nathan Wittmann
* Date: 4/23/2014
*************************************************/

public class GalToLitTable
{

	public static void main(String args[])
	{
		double gallons; //holds gallons to convert
		double liters;  //holds liter conversion
		int counter;

		counter = 0;
		
		for(gallons = 1; gallons <= 100; gallons++)
		{
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters");

			counter++;

			if(counter == 10)
			{
				System.out.println();
				counter = 0;
			}
		}
		
		
	}
}
