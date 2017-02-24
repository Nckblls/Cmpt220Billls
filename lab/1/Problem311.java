/**
   * file: Problem311.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Determines the days in the month given. 
   *
   */
import java.util.Scanner;
public class Problem311{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a month and a year:");
    int month = input.nextInt();
    int year = input.nextInt();
    //Outputs the days in the month.
    switch (month % 12){
      case 0: System.out.println("December of " + year + " had 31 days."); break;  
      case 1: System.out.println("January of " + year + " had 31 days."); break; 
      case 2: if ((year % 4) == 0){
        System.out.println("February of " + year + " had 29 days."); break;
      }
      else {
          System.out.println("February of " + year + " had 28 days."); break;
      }
      case 3: System.out.println("March of " + year + " had 31 days."); break; 
      case 4: System.out.println("April of " + year + " had 30 days."); break; 
      case 5: System.out.println("May of " + year + " had 31 days."); break; 
      case 6: System.out.println("June of " + year + " had 30 days."); break; 
      case 7: System.out.println("July of " + year + " had 31 days."); break; 
      case 8: System.out.println("August of " + year + " had 31 days."); break; 
      case 9: System.out.println("September of " + year + " had 30 days."); break; 
      case 10: System.out.println("October of " + year + " had 31 days."); break; 
      case 11: System.out.println("November of " + year + " had 30 days."); break;

    }
    
  }
}