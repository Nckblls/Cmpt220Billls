/**
   * file: Problem2.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 26th, 2017
   * 
   * 
   * Converts Celcius to Farenheit.
   */
import java.util.Scanner;
public class Problem2{ 
  public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in Celcius:");
    Double celcius = input.nextDouble();
	Double farenheit = (9.0 / 5) * celcius + 32;
	System.out.println(celcius + " Celsius is " + farenheit + " Farenheit.");
  }
}
