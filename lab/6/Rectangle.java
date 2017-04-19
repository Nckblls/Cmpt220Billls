/**
   * file: Rectangle.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18th, 2017
   * 
   * 
   * 
   * This file is the rectangle object file for Problem9.1,
   * it posseses many of the variables for a rectange and 
   * methods for calculating area and perimeter.
   */
class Rectangle{
  double width = 1;
  double height = 1;
  
  /**
   * rectangle
   *
   * This function creates a default rectangle object
   */
  Rectangle(){
  } 
  
  /**
   * Rectangle 
   *
   * This function creates a rectangle with custom values 
   *  
   * 
   * Parameters:
   *   nheight: Height of rectangle
   *   nwidth: Width of rectangle 
   * 
   */
  Rectangle(double nheight, double nwidth){
    height = nheight;    
    width = nwidth;  
    }
    
    /**
   * getArea
   *
   * This function calculates the area of the rectangle.  
   *  
   * 
   * 
   * Return value: a double value with the calculated area.
   */
  public double getArea(){  
    double area = height * width;
    return area;
   }
   
    /**
   * getPerimeter
   *
   * This function calculates the perimeter of the rectangle.  
   *  
   * 
   * 
   * Return value: a double value with the calculated perimeter.
   */
  public double getPerimeter(){
    double perimeter = (2*height)+ (2*width);
    return perimeter; 
  }  
}