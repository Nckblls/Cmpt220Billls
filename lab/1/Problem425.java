/**
   * file: Problem425.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Creates a license plate with random numbers and letters.
   * 
   */
public class Problem425{
  public static void main(String[] args){
	for (int x = 0; x< 100; x++){
    int firstletter = (int)(Math.random()*12) + 1;
	int secondletter = (int)(Math.random()*12) + 1;
	int thirdletter = (int)(Math.random()*12) + 1;
	int firstnum = (int)(Math.random()*12) + 1;
	int secondnum = (int)(Math.random()*12) + 1;
	int thirdnum = (int)(Math.random()*12) + 1;
	int fourthnum = (int)(Math.random()*12) + 1;
	
	System.out.println("Your license plate number is: " + firstletter + secondletter + thirdletter + firstnum + secondnum + thirdnum + fourthnum);
  }
}