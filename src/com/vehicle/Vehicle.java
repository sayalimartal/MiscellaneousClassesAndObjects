//Class Vehicle to hold vehicle details and stop vehicle, change vehicle direction
package com.vehicle;

public class Vehicle {

	private int speed;
	private int degree;
	private String ownerName;
	private static int identificationNumber=50000;
	private int vehicleIdNo;
	protected static final int TURN_LEFT=1;
	protected static final int TURN_RIGHT=0;
	
	public Vehicle()
	{
		vehicleIdNo=identificationNumber+1;
		identificationNumber+=1;
	}
	
	public Vehicle(String name)
	{
		vehicleIdNo=identificationNumber+1;
		identificationNumber+=1;
		this.ownerName=name;	
	}
	
	public static int getIdentificationNumber() {
		return identificationNumber;
	}
	
	public int getVehicleIdNo(){
		return vehicleIdNo;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void changeSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		if(degree<0)
			this.degree+=360;
		this.degree = degree%360;
	}

	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	//Turn vehicle to the left or to the right by 90 degrees
	public int turnLeftRight(int turn)
	{
		this.degree=(turn==1)?((this.degree+90))%360:((this.degree-90)%360);
		return degree;
	}
	
	//Change vehicle direction by some degrees
	public int changeDirection(int change)
	{
		if(change>=0)
			degree+=change;
		else
			degree-=change;
		return degree;
	}
	
	//Stop the vehicle
	public void stop()
	{
		this.speed=0;
	}

	//Display vehicle details
	@Override
	public String toString() {
		return "Vehicle [speed=" + this.speed + ", degree=" + degree + ", ownerName=" + ownerName + ", vehicleIdNo="
				+ vehicleIdNo + "]";
	}
}
