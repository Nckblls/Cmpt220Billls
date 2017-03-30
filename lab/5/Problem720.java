/**
   * file: Project720.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30, 2017
   * 
   * 
   * 
   * This file sorts an array from largest to smallest and prints the answer. 
   */


import java.util.Scanner;
public class Problem720 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    System.out.println("Please enter 10 " + "value(s) for array one:");
    for (int x = 0; x < 10; x++){
      double arrayvalue = input.nextDouble();
      array[x] = arrayvalue;
    }
    //Sends the array to selectionSort
    selectionSort(array);
    for (int s = 0 ; s < array.length ; s++){
      System.out.print(Math.round(array[s]) + " ");
    }
    
  }

  /**
   * selectionSort
   *
   * This function sorts the array from largest to smallest. 
   *  
   * 
   * Parameters:
   *   list: is the array to be sorted
   * 
   * Return value: an array which is sorted highest to lowest. 
   */

  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the largest in the list[i..list.length-1]
      double currentMax = list[i];
      int currentMaxIndex = i;
      for (int j = i + 1; j < list.length; j++) {
      if (currentMax < list[j]) {
        currentMax = list[j];
        currentMaxIndex = j;
      }
    }
      // Swap list[i] with list[currentMinIndex] if necessary
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
}
}
}
}