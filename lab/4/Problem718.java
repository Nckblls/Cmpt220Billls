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
public class Problem718{
  public static void main(String[] args){
    double[] tosort  = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 10 numbers:");
    
    for (int k = 0; k < 10; k++){
      tosort[k] = input.nextDouble();
    }
    
    bubblesort(tosort);
    
    System.out.println("The sorted array is:");
    for (int t = 0; t < 10; t++){
      System.out.print(tosort[t] + " ");
    }
    
  }
    
    
  
  
  /**
   * bubblesort
   *
   * This function sorts the array lowest to 
   * highest with the bubble sort sorting method. 
   *
   * Parameters:
   *   double[] array: An array of doubles to be sorted. 
   *     
   * There is no return value, the array is sorted. 
   *  
   */
  public static void bubblesort(double[] array){
    double lowestdigit = array[0];
    for (int i = 0; i < array.length; i++){
      for (int g = 0; g < array.length - 1; g++){
        if (array[g] > array[g+1]){
          double b = array[g];
          double a = array[g+1];
          array[g] = a;
          array[g+1] = b;
        }
      }
    }
  }
  
}