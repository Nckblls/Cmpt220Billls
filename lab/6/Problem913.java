/**
   * file: Project91.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18th, 2017
   * 
   * 
   * This is the test class for problem 9.13 which enacts the 
   * location.java object to find, the position of, and the highest value in an array.
   */
import java.util.Scanner;
public class Problem913{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the array size variables: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] doublearray = new double[row][column];
    for (int i = 0; i < doublearray.length; i++){
      for (int g = 0; g < doublearray[i].length; g++){
        doublearray[i][g] = input.nextDouble();
      }
    }
    Location biggest = new Location();
    biggest.locateLargest(doublearray);
    System.out.println(biggest.row + "," + biggest.column);
    
    
  }
}