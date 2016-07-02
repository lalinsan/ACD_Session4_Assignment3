/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 3
* Rectangle Class that is extended by the Triangle Class
*/


public class Rectangle {
   public double height;  //Variable to store height
   private double width;   //Variable to store width. Only use by the Rectangle Class
     
   //Methods that sets the Rectangle Height
   public void setRectangleHeight (double height)
   {
	   this.height=height;
	   
   }
   
   //Methods that sets the Rectangle Width
   public void setRectangleWidth (double width)
   {
	   this.width=width;
	   
   }
   
   //Method that calculates the Rectangle Area and returns the value
   public double getRectangleArea ()
   {
	   return width*height;
	   
   }
   
}


