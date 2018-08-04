//Display countries with largest area, largest population and largest population density 
package com.testcountry;

import java.util.Scanner;
import com.country.Country;

public class CountryTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of countries");
		int num=scanner.nextInt(); //Number of countries
		
		Country[] country=new Country[num]; //Array of country objects
		
		for(int i=0;i<num;i++) //Input details of each country
		{
			country[i]=new Country();
			
			System.out.println("Enter the country name");
			String name=scanner.next();
			country[i].setCountryName(name);
			
			System.out.println("Enter the country area");
			country[i].setArea(scanner.nextDouble());
			
			System.out.println("Enter the country population");
			country[i].setPopulation(scanner.nextDouble());
		}

		scanner.close();
		
		System.out.println("Country details are:");
		for(int i=0;i<num;i++)
			System.out.println(country[i]);
		
		System.out.print("The country with the largest area is ");
		System.out.println(country[0].findLargestArea(num,country)); //Country with largest area
		
		System.out.print("The country with the largest population is ");
		System.out.println(country[0].findLargestPopulation(num,country)); //Country with largest population
		
		System.out.print("The country with the largest population density is ");
		System.out.println(country[0].findLargestPopDen(num,country)); //Country with largest population density
	}
}
