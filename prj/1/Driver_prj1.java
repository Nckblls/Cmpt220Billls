/**
   * file: Driver_prj1.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: project 1
   * due date: March 30, 2017
   * 
   * 
   * This file takes two different arrays input by the user
   * and sends them to a method which convlutes them and then prints the output to the console. 
   */


import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Takes in two different arrays
    System.out.println("Please enter the size of array one:");
    int sizeone = input.nextInt();
    double[] vone = new double[sizeone];

    System.out.println("Please enter the size of array two:");
    int sizetwo = input.nextInt();
    double[] vtwo = new double[sizetwo];

    System.out.println("Please enter " + sizeone +" value(s) for array one:");
    for (int x = 0; x < sizeone; x++){
      double arrayvalue = input.nextDouble();
      vone[x] = arrayvalue;
    }
    
    System.out.println("Please enter " + sizetwo +" value(s) for array one:");
    for (int x = 0; x < sizetwo; x++){
      double arrayvalue = input.nextDouble();
      vtwo[x] = arrayvalue;
    }
    
    // Sends them to convolveVectors method
    // Prints the output as doubles, all in the same line
    
    double[] result = convolveVectors(vone, vtwo);
    
    for (int s = 0 ; s < result.length ; s++){
      System.out.print(Math.round(result[s]) + " ");
    }
    
    
  }

  
  /**
   * convolveVectors
   *
   * This function computes the convolution of the two given 
   * arrays, and returns them in a conjoined array. 
   * 
   * Parameters:
   *   vFirst: one of the arrays to be convoluted
   *   vSecond: another of the arrays to be convoluted
   * 
   * Return value: an array result possessing the convolution of the original two arrays.
   */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    // Gives the idx through the result
    for (int idx = 0; idx < vResult.length; idx ++){
      vResult[idx] = 0;
      //Gives the shift for each iteration, this is for if first array is larger. 
      if (vFirst.length > vSecond.length){
        for (int shift = 0; shift < vFirst.length; shift ++){
          if ((idx - shift) >= 0 && (idx - shift) < vFirst.length){
            if ((shift) >= 0 && shift < vSecond.length){  
              vResult[idx] += vFirst[idx - shift] * vSecond[shift];
            }
          }
        }
      }
      //Shift for if second array is larger
      else{
        for (int shift = 0; shift < vSecond.length; shift ++){
          if ((idx - shift) >= 0 && (idx - shift) < vFirst.length){
            if ((shift) >= 0 && shift < vSecond.length){  
              vResult[idx] += vFirst[idx - shift] * vSecond[shift];
            }
          }
        }
      }
    }

    return vResult;  
  }

}