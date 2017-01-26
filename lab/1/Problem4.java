/**
   * file: Problem4.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 26th, 2017
   * 
   * 
   * Seperates an interger into it's 
   * component digits and adds the together.
   */
import java.util.Scanner;
public class Problem4 { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000:");
    //Takes number in and seperates it into it's parts.
	int number = input.nextInt();
	int firstdigit = number % 10;
	number = number / 10; 
	int secondnumber = number % 10;
	number = number/10;
	int lastnumber = number % 10; 
	//Sums the numbers and then outputs the sum. 
	int sum = firstdigit + secondnumber + lastnumber;
	System.out.println(" The sum is " + sum);
  } 
}
