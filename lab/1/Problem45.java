/**
   * file: Problem45.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Calculates the area of a polygon.
   * 
   */
import java.util.Scanner;
public class Problem45{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number of sides:");
    int numbersides = input.nextInt();
    System.out.println("Enter a radius:");
    double sidelength = input.nextDouble();

    double area = (numbersides * Math.pow(sidelength,2)) /(4 * (Math.tan(Math.PI/numbersides)));

    area = Math.round (area * 1000.0/1000.0);
    System.out.println("The area is: " + area);
  }
}


