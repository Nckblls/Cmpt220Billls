/**
   * file: Problem41.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Calculates the area of a pentagon.
   *
   */
import java.util.Scanner;
public class Problem41{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius:");
    double vertexlength = input.nextDouble();
    double sidelength = 2 * vertexlength * Math.sin(Math.PI/5);
    double area = (5 * Math.pow(sidelength,2)) /(4 * Math.tan(Math.PI/5));
    area=Math.round (area * 100.0) / 100.0;  
    System.out.println(area);
  }
}



