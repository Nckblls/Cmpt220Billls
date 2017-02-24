  /**
   * file: Problem63.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * version: 1.4 
   * 
   * 
   * Has the methods reverse, which reverses a series of intergers, 
   * and palindrome, which checks to see if the numbers are in the same series reversed.
   * 
   */
import java.util.Scanner;
public class Problem63{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int revnum = reverse(number);
    System.out.println("The number is "+ revnum + " reversed.");
    System.out.println("Is the number a palindrome? " + palindrome(number));
  }

  
  /**
   * reverse
   *
   * This function reverses the order of the numbers
   * in an interger given to it.
   * 
   * Parameters:
   *   number: the number which will have the order of it's numbers reversed.
   * 
   * Return value: an interger in the reverse order of the original parameter.
   */
  public static int reverse(int number){
    int revnum = 0;
    int lastdigit;
    while (number > 10){
      revnum = revnum * 10;
      lastdigit = number %10;
      revnum = revnum + lastdigit;
      number = number/10;
    }
    revnum = revnum * 10;
    revnum = revnum + number;
    return revnum;
  }
    /**
   * Palindrome
   *
   * This function determines if the interger given to it is a palindrome, 
   * meaning the same forward and backward. 
   * 
   * Parameters:
   *   number: the number which will be chacked to see if it is a palindrome. 
   * 
   * Return value: a boolean telling true if it is a palindrome and false if it is not. 
   */
  public static boolean palindrome(int number){
    if ( reverse(number) == number){
    return true; 
    }
    else{
      return false;
    }
  }
}