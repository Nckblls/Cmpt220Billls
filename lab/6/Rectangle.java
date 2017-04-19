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
  Rectangle(){
  } 
  Rectangle(double nheight, double nwidth){
    height = nheight;    
    width = nwidth;  
    }
  public double getArea(){  
    double area = height * width;
    return area;
   }
  public double getPerimeter(){
    double perimeter = (2*height)+ (2*width);
    return perimeter; 
  }  
}