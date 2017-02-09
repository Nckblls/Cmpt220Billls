/**
   * file: Problem48.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Takes a letter and gives the corresponding ASCII Letter.
   * 
   */
import java.util.Scanner;
public class Problem48{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an ASCII number:");
    int ascii = input.nextInt();
    char letter = (char)ascii;
    System.out.println("Your letter is "+ letter);
  }
}

