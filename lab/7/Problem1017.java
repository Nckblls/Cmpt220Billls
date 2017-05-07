/**
   * file: Project1017.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 26th, 2017
   * 
   * 
   * Finds the next ten square numbers after long.MaxValue.
   * 
   */

import java.lang.Math;
import java.math.BigDecimal;
public class Problem1017{
  public static void main(String[] args){
    BigDecimal x = new BigDecimal((long)Math.sqrt(Long.MAX_VALUE));
    for (int i = 1; i < 11; i++){
      x = x.add(BigDecimal.ONE);
      BigDecimal x2 = x.multiply(x);
      System.out.println(i + " "+"Number:" + x + ", Square: " + x2);
    }    
  }
}