/**
   * file: Problem51.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * 
   * 
   * Takes a series of numbers and decides how many are positive or negative. 
   * Also takes the sum and average of the series.
   */
import java.util.Scanner;
public class Problem51{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int numberinput;
    int numberspositive = 0;
    int numbersnegative = 0;
    int numstotal = 0;
    double numsavg = 0;
    do {
       numberinput = input.nextInt();
      if (numberinput >0){
        numberspositive++;
      }
      if (numberinput < 0){
        numbersnegative++;
      }
      numstotal = numstotal + numberinput;
    } while(numberinput != 0);
    System.out.println("The positive numbers are: " + numberspositive);
    System.out.println("The negative numbers are: " + numbersnegative);
    System.out.println("The total is: " + numstotal);
    numsavg = numstotal / (numberspositive + numbersnegative);
    System.out.println("The average is: " + numsavg);
    
  }
}