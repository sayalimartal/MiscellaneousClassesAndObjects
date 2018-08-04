//Class Country to store the country name, area and population
package com.country;

public class Country {
	
	private String countryName;
	private double population;
	private double area;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//Find country with largest area
	public Country findLargestArea(int num, Country C[])
	{
		int i,flag=0;
		double maxArea=C[0].getArea();
		for(i=0;i<num;i++)
		{
			if(C[i].getArea()>maxArea)
			{
				maxArea=C[i].getArea();
				flag=i;
			}
		}
		return C[flag];
	}
	
	//Find country with largest population
	public Country findLargestPopulation(int num, Country C[])
	{
		int i,flag=0;
		double maxPopulation=C[0].getPopulation();
		for(i=0;i<num;i++)
		{
			if(C[i].getPopulation()>maxPopulation)
			{
				maxPopulation=C[i].getPopulation();
				flag=i;
			}
		}
		return C[flag];
	}
	
	//Find country with largest population density
	public Country findLargestPopDen(int num, Country C[])
	{
		int i,flag=0;
		double maxPopDen=(C[0].getPopulation()/C[0].getArea());
		for(i=0;i<num;i++)
		{
			if((C[i].getPopulation()/C[i].getArea())>maxPopDen)
			{
				maxPopDen=(C[i].getPopulation()/C[i].getArea());
				flag=i;
			}
		}
		return C[flag];
	}
	
	//Display country details
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", population=" + population + ", area=" + area + "]";
	}
			
}
