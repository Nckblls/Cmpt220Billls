/** 
  * file: Problem79.java
  * author: Nicholas Bills
  * course: CMPT 220
  * assignment: Lab 4
  * due date: March 9th
  *
  * Takes in an array of doubles. Uses a method to find the lowest value.
  * Prints the lowest value found. 
  */
import java.util.Scanner;
public class Problem79{
  public static void main(String[] args){
    double[] tosort  = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 10 numbers:");
    
    for (int k = 0; k < 10; k++){
      numbers[k] = input.nextDouble();
    }
    
    double smallestvalue = min(numbers);
    System.out.println("The smallest value given is: " + smallestvalue);
  }
    
    
  
  
  /**
   * min
   *
   * This function finds the lowest value in an array of doubles.
   * 
   * Parameters:
   *   double[] array: An array of doubles to be read. 
   * 
   * Return value: The lowest digit is returned. 
   */
  public static double min(double[] array){
    double lowestdigit = array[0];
    for (int i = 0; i < array.length; i++){
      if (array[i] < lowestdigit){
        lowestdigit = array[i];
      }
    }
    return lowestdigit;
  }
  
}