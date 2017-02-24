/**
   * file: Problem513.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * version: 1.1
   * 
   * 
   * Calculates the largest N value that's cube is less than 12,000.
   * 
   */
import java.util.Scanner;
public class Problem513{
  public static void main(String[] args){
    int number = 0;
    int numbercubed = 0;
    //increments until the number cubed is greater than 12,000.
    while (numbercubed < 12000){
      number++;
      numbercubed = number*number*number;
    }
    System.out.println("The largest value of N is: " + number);
  }
}