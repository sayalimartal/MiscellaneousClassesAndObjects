//Class to represent a triangle and identify the triangle type
package com.triangle;

import java.util.Arrays;

public class Triangle {
	private int[] side=new int[3];

	public int[] getSide() {
		return side;
	}

	public void setSide(int[] side) {
		this.side = side;
	}
	
	public boolean isRight(Triangle T)
	{
		int sideSquare1=T.side[0]*T.side[0];
		int sideSquare2=T.side[1]*T.side[1];
		int sideSquare3=T.side[2]*T.side[2];
		
		if((sideSquare1==sideSquare2+sideSquare3) || (sideSquare2==sideSquare1+sideSquare3) || (sideSquare3==sideSquare1+sideSquare2))
			return true;
		else
			return false;
	}
	
	public boolean isScalene(Triangle T)
	{
		if(T.side[0]!=T.side[1] && T.side[1]!=T.side[2]  && T.side[2]!=T.side[0])
			return true;
		else
			return false;
	}
	
	public boolean isIsosceles(Triangle T)
	{
		if(T.side[0]==T.side[1] || T.side[1]==T.side[2]  || T.side[2]==T.side[0])
			return true;
		else
			return false;
	}
	
	public boolean isEquilateral(Triangle T)
	{
		if(T.side[0]==T.side[1] && T.side[1]==T.side[2]  && T.side[2]==T.side[0])
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Triangle [side=" + Arrays.toString(side) + "]";
	}
	
	
}
