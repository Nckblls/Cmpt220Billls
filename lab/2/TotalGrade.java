/**
   * file: TotalGrade.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Calculates the final grade of a student in this class
   * based on the given partial grades. 
   */
import java.util.Scanner;
public class TotalGrade{
  public static void main(String[] args){
    System.out.println("Please enter the following as percentages.");
    System.out.println("midterm exam:");
    //Calculates the partial grade of the midterm on the final grade.
    Scanner input = new Scanner(System.in);
    Double midtermgrade = input.nextDouble();
    midtermgrade = midtermgrade * 0.2;
    //Calculates the partial grade of the final exam on the final grade.
    System.out.println("final exam:");
    Double finalexamgrade = input.nextDouble();
    finalexamgrade = finalexamgrade * 0.2;
    //Calculates the partial grade of the projects on the final grade.
    System.out.println("projects:");
    Double projectgrade = input.nextDouble();
    projectgrade = projectgrade * 0.2;
    //Calculates the partial grade of the homework and labs on the final grade.
    System.out.println("Homework and labs:");
    Double homeworkgrades = input.nextDouble();
    homeworkgrades = homeworkgrades * 0.4;
    //Sums the partial grades and outputs them. 
    Double finalgrade = (midtermgrade + finalexamgrade + projectgrade + homeworkgrades);
    System.out.println("You're final grade is: " + finalgrade + "%");
    if ((finalgrade / 10 >= 9)){
      if (((finalgrade% 10)>=5)||((finalgrade/ 10)==10)) {
        System.out.println("You're final grade is an: A");
      }
      else if ((finalgrade% 10)<=5){
        System.out.println("You're final grade is an: A-");
      }
    }
    if ((finalgrade / 10) == 8){
      if ((finalgrade% 10)>=7) {
        System.out.println("You're final grade is an: B+");
      }
      else if (((finalgrade% 10)>=3)&&(finalgrade% 10)<=7){
        System.out.println("You're final grade is an: B");
      }
      else if ((finalgrade% 10)<=3){
        System.out.println("You're final grade is an: B-");
      }
    }
    if ((finalgrade / 10) == 7){
      if ((finalgrade% 10)>=7) {
        System.out.println("You're final grade is an: C+");
      }
      else if (((finalgrade% 10)>=3)&&(finalgrade% 10)<=7){
        System.out.println("You're final grade is an: C");
      }
      else if ((finalgrade% 10)<=3){
        System.out.println("You're final grade is an: C-");
      }
    }
    if ((finalgrade / 10) == 6){
      if ((finalgrade% 10)>=5) {
        System.out.println("You're final grade is an: D+");
      }
      else if ((finalgrade% 10)<=5){
        System.out.println("You're final grade is an: D");
      }
    }
    if ((finalgrade / 10) < 6) {
      System.out.println("You're final grade is an: F");
    }
  }
}
