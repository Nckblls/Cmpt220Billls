/**
   * file: Project731.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30, 2017
   * 
   * 
   * 
   * This file uses a pivot sort on the first value of an array. 
   */


import java.util.Scanner;
public class Problem732 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size:");
    int size = input.nextInt();
    int[] array = new int[size];
    System.out.println("Please enter " + size + " value(s) for array one:");
    for (int x = 0; x < size; x++){
      int arrayvalue = input.nextInt();
      array[x] = arrayvalue;
    }
    //Sends the array to selectionSort
    partition(array);
    for (int s = 0 ; s < array.length ; s++){
      System.out.print(Math.round(array[s]) + " ");
    }
    
  }

  /**
   * partition
   *
   * This function sorts the array in one iteration of a pivot sort. 
   *  
   * 
   * Parameters:
   *   list: is the array to be sorted
   * 
   * Return value: the postition of the pivot value in the new array
   */
  
  
  public static int partition(int[] list){
    int pivval = list[0];
    int position = 0;    
    int index = position + 1;
    int index2 = list.length-1;
    
    
    while (index2 > index){
      while(list[index] <= pivval && index <= index2){
        index++;
      }
      while(list[index2] > pivval && index <= index2){
        index2--;
      }     
      if (index2 > index){
        int newval = list[index];
        list[index] = list[index2];
        list[index2] = newval;
      }
          //Add if it reaches the end it increments anyway and adds to reruns to stop a loop
          
    }
    while (index2 >= index && list[index2] >= pivval){
      index2--;
    }
    if (index2 > position){
      int newval = list[index2];
      list[index2] = pivval;
      list[position] = newval;
      position = index2;
    
    }

  return position; 
  }
}