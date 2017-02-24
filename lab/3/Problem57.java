/**
   * file: Problem57.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * 
   * 
   * Calculates the tuition money for a college after ten years of gradual increase.
   * Cost is calculated for a set tuition price after ten years and for increasing tuition price. 
   *  
   */
import java.util.Scanner;
public class Problem57{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double tuition = 10000;
    double cost = 0;
    for (int x = 0; x < 10; x++ ){
    double moneyadd = tuition * 0.05;
    tuition = tuition + moneyadd;
    System.out.print(x);
    }
    double noincreasecost = tuition * 4;
    for (int y = 0; y < 4; y++ ){
      cost += tuition;
      double moneyadd = tuition * 0.05;
      tuition = tuition + moneyadd;
    }
    System.out.println("The price is " + cost + "for four years, with ever increasing prices.");
    System.out.println("The price is " + noincreasecost + "for four years, with a stagnant price over the interim.");
  }
}