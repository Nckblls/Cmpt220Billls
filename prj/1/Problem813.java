/**
   * file: Project813.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30, 2017
   * 
   * 
   * 
   * This file finds the location of the largest value in a double array.
   */
   
import java.util.Scanner;
public class Problem813{
  public static void main(String[] args){
    //Takes the two-dimensional array in.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and then columns. ");
    int rows = input.nextInt();
    int columns = input.nextInt(); 
    double[][] m = new double[rows][columns];
    System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns of values: ");
    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[i].length; j++)
        m[i][j] = input.nextInt();
    //Sends the two-dimensional array to the locateLargest method.
    int[] largest = locateLargest(m);
    //Prints the returned coordinates.
    System.out.print(largest[0] );
    System.out.print(",");
    System.out.println(largest[1]);
}
  
   /**
   * locateLargest
   *
   * This function finds the coordinates of the largest value
   * in a two-dimensional array and returns the coordinates of this value in an array. 
   * 
   * Parameters:
   *   a: the two dimensional array that is to be sorted.
   *   
   * 
   * Return value: an array possessing
   * the coordinates of the largest value in the two dimensional array.
   */
  
  
  public static int[] locateLargest(double[][] a){
    int coordinate1 = 0;
    int coordinate2 = 0;
    double highestvalue = a[0][0];
    
    //Searches for the largest value.
    for (int row = 0; row < a.length; row++){
      for (int col = 0; col < a[row].length; col++){
          if (a[row][col] > highestvalue) {
            coordinate1 = row;
            coordinate2 = col; 
          }
      }
    }
    
    int[] coordinates = new int[2];
    coordinates[0] = coordinate1;
    coordinates[1] = coordinate2;
    return coordinates;
  }
  
}


