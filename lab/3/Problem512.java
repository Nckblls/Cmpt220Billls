/**
   * file: Problem512.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * 
   * 
   * Calculates the smallest N value that's square is less than 12,000.
   * 
   */
import java.util.Scanner;
public class Problem512{
  public static void main(String[] args){
    int number = 0;
    int numbersquared = 0;
    //Increments until N squared is greater than 12,000.
    while (numbersquared < 12000){
      number++;
      numbersquared = number*number;
    }
    System.out.println("The smallest value of N is: " + number);
    
  }
}