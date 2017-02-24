/**
   * file: Problem425.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * version: 1.5
   * 
   * 
   * Creates a license plate with random numbers and letters.
   * 
   */
public class Problem425{
  public static void main(String[] args){
    //Creates all of the Letters Randomly
    int firstletternum = (int)(Math.random()*((90-65) + 1)+65);
    char firstletter = (char)firstletternum;
    int secondletternum = (int)(Math.random()*((90-65) + 1)+65);
    char secondletter = (char)secondletternum;
    int thirdletternum = (int)(Math.random()*((90-65) + 1)+65);
    char thirdletter = (char)thirdletternum;
    //Creates all the numbers Randomly
    int firstnum = (int)(Math.random()*10);
    int secondnum = (int)(Math.random()*10);
    int thirdnum = (int)(Math.random()*10);
    int fourthnum = (int)(Math.random()*10);
    //prints them to console
    System.out.println("Your license plate number is: " + firstletter + secondletter + thirdletter + firstnum + secondnum + thirdnum + fourthnum);
  }
}