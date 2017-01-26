/**
   * file: Problem3.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 26th, 2017
   * 
   * 
   * Calculates gratuity and price
   * based on the subtotal and gratuity rate.
   */
import java.util.Scanner;
public class Problem3{ 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the subtotal and gratuity rate:");
    Double subtotal = input.nextDouble();
	Double gratuityrate = input.nextDouble();
	Double gratuity = subtotal * (gratuityrate/100);
	Double totalprice = subtotal + gratuity;
	System.out.println(" The gratuity is $" + gratuity + " making the total $"+ totalprice + ".");
  } 
}
