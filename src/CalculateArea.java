/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 3
* Java Programs that implements the Rectangle and extends the Triangle Class from the Rectangle
* Calculates Rectangle and Triangle based on the values passed by the user
*/


import java.util.Scanner; //Imports Scanner Class from java API Class Library

public class CalculateArea {

	public static void main(String[] args) { //Main Method to call to start the Program
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //Creates an Instance if of Scanner Object to take user's input
		
	    String choice="Y"; //Variable to store the user's choice to run the program. Initialized to Y
	    
	    //Prints out the App Header
	    System.out.println ("===========================================================");
	    System.out.println ("+++ Rectangle & Triangle Area Calculation +++");
	    System.out.println ("===========================================================");
	    
		
	  //Executes code as long as the User's choice = Y or Yes
		while (choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
	    {
	        //Prints out the Rectangle Header	
	    	System.out.println ("===========================");
			System.out.println ("       ** Rectangle **     ");
			System.out.println ("===========================");
	    				
	    	System.out.print("Enter width : "); //Prompts user to enter the width
			double width = sc.nextDouble(); //Stores the value entered by the user
						
			System.out.print("Enter height : "); //Prompts user to enter the width
			double height = sc.nextDouble(); //Stores the value entered by the user
						
			Rectangle rectangle = new Rectangle (); //Creates a new Rectangle from the Shape Class
			rectangle.setRectangleHeight(height);  //Sets the rectangle height to the value entered by the user
			rectangle.setRectangleWidth(width); //Sets the rectangle width to the value entered by the user
			
			double rectangleArea; //Stores the result of the Rectangle Area
			rectangleArea=rectangle.getRectangleArea(); //Calls getRectangleArea method from the Rectangle Class to calculate Rectangle Area
			
			//Prints out Rectangle Information
			System.out.println ("Rectangle width  :"+"" + width);
			System.out.println ("Rectangle height :"+"" + height);
			System.out.println ("===========================");
			System.out.println ("Rectangle Area :"+"" + rectangleArea);
			System.out.println ("****************************");
			
			//Prints out the Triangle Header	
	    	System.out.println ("===========================");
			System.out.println ("       ** Triangle **     ");
			System.out.println ("===========================");
			
			System.out.print("Enter height: "); //Prompts user to enter the width
			double heightT = sc.nextDouble(); //Stores the value entered by the user
			
			System.out.print("Enter base: "); //Prompts user to enter the width
			double base = sc.nextDouble(); //Stores the value entered by the user
			
			Triangle triangle = new Triangle (); //Creates a new Triangle from the Shape Class
			
			double triangleArea; //Stores the result of the Triangle Area
			triangle.setTriangleBase(base); //Sets the triangle base to the value entered by the user
			triangle.setTriangleHeight(heightT); //Sets the triangle height to the value entered by the user			
			triangleArea=triangle.getTriangleArea(); //Calls getTriangleArea method from the Triangle Class to calculate Triangle Area
			
			//Prints out Triangle Information
			System.out.println ("Triangle Base  :"+"" + base);
			System.out.println ("Triangle Height :"+"" + heightT);
			System.out.println ("===========================");
			System.out.println ("Triangle Area :"+"" + triangleArea);
			System.out.println ("****************************");
			
									
			System.out.print("Do you want to try again Y|N? : "); //Prompts the user to try again
			choice=sc.next(); //Stores the User's response

	    }
	    	System.out.println ("===========================");
	        System.out.print("Thanks for trying the Area Calculation App"); //Good by message
	    	
	}

}
