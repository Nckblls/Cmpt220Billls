/**
   * file: Problem426.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Takes a string value and determines the change
   * that should be given out.
   */
import java.util.Scanner;
public class Problem426 {
  public static void main(String[] args) {
  // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print(
    "Enter an amount of money, for example 11.56: ");
    String amount = input.next();
    int decimaldistance = amount.lastIndexOf('.');
    int length = amount.length();
    String dollars = amount.substring(0,decimaldistance);
    String afterdecimal = amount.substring(decimaldistance + 1);
 
    int cents = Integer.parseInt(afterdecimal);
    // Find the number of one dollars
    int numberOfDollars = Integer.parseInt(dollars);
    int remainingAmount;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = cents/ 25;
    remainingAmount = cents % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println(" " + numberOfDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters ");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");
  }
}