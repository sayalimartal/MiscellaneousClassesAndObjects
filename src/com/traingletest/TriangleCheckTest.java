//Create Triangle objects and identify their types
package com.traingletest;

import java.util.Scanner;
import com.triangle.Triangle;

public class TriangleCheckTest {

	public static void main(String[] args) {
		
		int i;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of triangles");
		int num=scanner.nextInt(); //Number of triangles
		
		int[][] side1=new int[num][3]; //Array of sides for each triangle
		Triangle[] triangle=new Triangle[num]; //Array of Triangle objects
		
		for(i=0;i<num;i++)
		{
			triangle[i]=new Triangle();
			
			System.out.println("Enter the sides of triangle "+(i+1));
			for(int j=0;j<3;j++)
				side1[i][j]=scanner.nextInt(); //Input triangle details
			triangle[i].setSide(side1[i]);
		}
		
		scanner.close();
		
		//Identify and display the triangle type
		for(i=0;i<num;i++)
		{
			System.out.print(triangle[i].toString());
			if(triangle[i].isEquilateral(triangle[i])==true)
				System.out.println(" is an equilateral triangle");
			else
			{
				if(triangle[i].isRight(triangle[i])==true)
					System.out.println(" is a right angled triangle");
				else
				{
					if(triangle[i].isIsosceles(triangle[i])==true)
						System.out.println(" is an isosceles triangle");
					else
					{
						if(triangle[i].isScalene(triangle[i])==true)
							System.out.println(" is a scalene triangle");
					}
				}
			}
		}			
	}
}