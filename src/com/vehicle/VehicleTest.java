//Test various Vehicle functionalities 
package com.vehicle;

import java.util.Scanner;

public class VehicleTest 
{

	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of vehicles");
		int numberOfVehicle=scanner.nextInt(); //Number of vehicles
		
		Vehicle vehicle[]= new Vehicle[numberOfVehicle]; //Array of Vehicle objects
		
		//Input Vehicle details
		for(int i=0; i<numberOfVehicle; i++)
		{
						
			System.out.println("Enter the name of vehicle "+(i+1)+"'s owner");
			String name= scanner.next();
			vehicle[i]= new Vehicle(name);
			
			System.out.println("Enter current speed  of vehicle "+(i+1));
			vehicle[i].changeSpeed(scanner.nextInt());
			
			System.out.println("Enter current direction of vehicle "+(i+1)+" in degrees");
			vehicle[i].setDegree(scanner.nextInt());
			
			System.out.println("Do you want to change the vehicle speed? Yes/No");
			String choiceChangeSpeed=scanner.next(); 
			if(choiceChangeSpeed.equals("Yes")) {
				System.out.println("Enter the desired speed");
				int speed=scanner.nextInt();
				vehicle[i].changeSpeed(speed);  //Input desired speed
			}
			
			System.out.println("Do you want to turn? Yes/No");
			String answerTurn=scanner.next();
			if(answerTurn.equals("Yes")) 
			{
				System.out.println("Directly turn Left or Right? Left/Right/No");
				String answerTurnValue=scanner.next();
				if(answerTurnValue.equals("Left")) 
					vehicle[i].turnLeftRight(Vehicle.TURN_LEFT); //Turn Vehicle to the left
				else if(answerTurnValue.equals("Right")) 
					vehicle[i].turnLeftRight(Vehicle.TURN_RIGHT); //Turn Vehicle to the right
				else
				{
				System.out.println("Turn by certain degrees? Yes/No");
				String turn=scanner.next();
				if(turn.equals("Yes")) 
				{
					System.out.println("By what value you want to change? Enter positive value to turn left,negative to turn right");
					int change=scanner.nextInt();
					vehicle[i].changeDirection(change); //Change Vehicle direction
				}
				}
			}
			System.out.println("Do you want to stop the vehicle? Yes/No");
			String stop=scanner.next();
			if(stop.equals("Yes")) { 
				vehicle[i].stop(); //Stop the Vehicle
				System.out.println("Vehicle stopped");
			}
		}
		
		scanner.close();
		
		//Display highest identification number
		System.out.println("The highest identification number is "+ Vehicle.getIdentificationNumber());

		for(int i=0; i<numberOfVehicle; i++)
			System.out.println(vehicle[i]);	//Display all Vehicle details
		
	}		
}
