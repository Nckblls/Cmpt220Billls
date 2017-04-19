/**
   * file: Project91.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18th, 2017
   * 
   * 
   * 
   * This file tests the rectangle object file
   */

public class Problem91{
  public static void main(String[] args){
    Rectangle one = new Rectangle(4 , 40);
    Rectangle two = new Rectangle(3.5, 35.9);
    System.out.println("Rectangle one: ");
    System.out.println("Height: " + one.height + " Width: " + one.width);
    System.out.println("Area: " + one.getArea() + " Perimeter: " + one.getPerimeter());
    System.out.println();
    System.out.println("Rectangle two: ");
    System.out.println("Height: " + two.height + " Width: " + two.width);
    System.out.println("Area: " + two.getArea() + " Perimeter: " + two.getPerimeter());
  }
}
