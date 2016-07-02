/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 3
* Triangle Class that extends the Rectangle Class
*/


public class Triangle extends Rectangle {
	public double base;  //Variable to store the Triangle base
	
	//Methods that sets the Triangle Base
	public void setTriangleBase (double base)
	{
		this.base=base;
	}
	
	//Methods that sets the Triangle Height
	public void setTriangleHeight (double height)
	{
		this.height=height;
	}
	
	//Methods that gets the Triangle Height
	public double getTriangleHeight ()
	{
		return height;
	}
	
	//Methods that calculates the Triangle Area and returns the value
	public double getTriangleArea ()
	{
		return (base*height)/2; //Calculates the Triangle Area
	}
	
	

}
