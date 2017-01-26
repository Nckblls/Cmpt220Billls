/**
   * file: TotalGrade.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 26th, 2017
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
  }
}