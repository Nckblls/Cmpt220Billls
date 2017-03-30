/**
   * file: Project730.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30, 2017
   *
   * 
   * 
   * This file combines two arrays in a sorted manner 
   */


import java.util.Scanner;
public class Problem730 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter size of array 1 and 2:");
    int size1 = input.nextInt();
    int[] arrone = new int[size1];
    int size2 = input.nextInt();

    int[] arrtwo = new int[size2];
    
    
    
    System.out.println("Please enter " + size1 + " value(s) for array one:");  
    
    
    for (int x = 0; x < size1; x++){
      int arrayvalue = input.nextInt();
      arrone[x] = arrayvalue;
    }
    System.out.println("Please enter " + size2 + " value(s) for array two:");
    
    
    for (int t = 0; t < size2; t++){
      int arayval = input.nextInt();
      arrtwo[t] = arayval;
    }
   
    int[] mergedlist = merge(arrone,arrtwo);
    for (int s = 0 ; s < mergedlist.length ; s++){
      System.out.print(mergedlist[s] + " ");
    }
    
    
  }

  /**
   * merge
   *
   * This function sorts two arrays while combining them. 
   *  
   * 
   * Parameters:
   *   list1: is the array to be combined
   *   list2: second array to be combined
   * 
   * Return value: an array which is a sorted combination of the first two. 
   */

  public static int[] merge(int[] list1, int[] list2) {
    int[] mergedlist = new int[list1.length + list2.length];
    int pos1=0;
    int pos2=0;
    int position = 0;
    //Goes through the arrays and sorts their values into new array 
    //quits if either array reaches the end. 
    for (int y = 0; y < mergedlist.length && pos1 < list1.length && pos2 < list2.length; y++){
      //if list1 val is less than list2val adds that value in
      position++;
      if (list1[pos1] <= list2[pos2]){
        
        mergedlist[y] = list1[pos1];
        pos1++;
        
      }
      else {
        //if not adds list2val to merged list
        mergedlist[y] = list2[pos2];
        pos2++;
       
      }
    }
    //once one of the lengths reaches their end the for loop quits
    // if pos1 has reached length then this 
    if (pos1 == list1.length ){
      for (int d = position; d < mergedlist.length; d++){
        mergedlist[d] = list2[pos2];
        pos2++;
             
      }
          
    }
    // if pos2 runs out of values the rest of merged list comes from here
    else if (pos2== list2.length){
      for (int g = position; g < mergedlist.length ; g++){
        mergedlist[g] = list1[pos1];
        pos1++;
               
              
      }
          
    }
    
  return mergedlist;
  }
}
