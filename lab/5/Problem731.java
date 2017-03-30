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
public class Problem731 {
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
    int index = 1;
    int end = list.length-1;
    boolean outoforder = true; 
    int isover = 0;
    int reruns = 0;
    int numbersless = 0; 
    
    boolean forwards = true;
    
    
    while (forwards){
        numbersless = 0;
        while(forwards){
          if(list[index] <= pivval && index > position){
            int newval = list[index];
            list[index] = pivval;
            list[position] = newval;
            position = index;
            forwards = false;
          }
          index++;
          //Add if it reaches the end it increments anyway and adds to reruns to stop a loop
          if (index == end){
            forwards = false;
            reruns++;
          }
        }
        while (!forwards){
          if (list[index] > pivval && index < position){
              int newval = list[index];
              list[index] = pivval;
              list[position] = newval;
              position = index;
              forwards = true;
          }
          index--;
          if (index == 0){
            forwards = true;
            reruns++;
          }
        }
        for (int x = 0; x < list.length; x++){
          
          if (list[x] < pivval){
          numbersless++;
          }
          
          System.out.println(numbersless);
          System.out.println(position);
        }
        
          if (numbersless == (position+1))
              forwards = false; 
          if (numbersless == 0)
              forwards = false; 
          
        
        
        
        
        
        
        
    }
    return 1; 
  }
  
}