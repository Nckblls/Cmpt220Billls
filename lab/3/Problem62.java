/**
   * file: Problem62.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * 
   * 
   * Takes the sum of each individual digit for some numbers. 
   * 
   */
import java.util.Scanner;
public class Problem62{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    long number = input.nextLong();
    int total = sumDigits(number);
    System.out.println(total);
  }
  

  public static int sumDigits(long n){
    int sum = 0; 
    while ( n>10){
      sum += n % 10;
      n = n/10;
    }
    sum += n%10;
    return sum;
  }
}