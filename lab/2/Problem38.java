/**
   * file: Problem38.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * version: 1.2
   * 
   * Sorts a set of given intergers.
   * 
   */
import java.util.Scanner;
public class Problem38{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Three intergers:");
    int firstdigit = input.nextInt();
    int seconddigit = input.nextInt();
    int thirddigit = input.nextInt();
    if (firstdigit >= seconddigit){
      if (seconddigit >= thirddigit){
        System.out.println(thirddigit + " " + seconddigit + " " + firstdigit); 
      }
      else if (thirddigit >= seconddigit && thirddigit >= firstdigit){
        System.out.println(seconddigit + " " + firstdigit + " " + thirddigit);
      }
      else if (thirddigit >= seconddigit && thirddigit <= firstdigit){
        System.out.println(seconddigit + " " + thirddigit + " " + firstdigit);
      }
    }
    if (seconddigit >= firstdigit){
      if (firstdigit >= thirddigit){
        System.out.println(thirddigit + " " + firstdigit + " " + seconddigit);
      }
      else if (thirddigit >= firstdigit && thirddigit >= seconddigit){
        System.out.println(firstdigit + " " + seconddigit + " " + thirddigit);
      }
      else if(thirddigit >= firstdigit && thirddigit <= seconddigit){
        System.out.println(firstdigit + " " + thirddigit + " " + seconddigit);
      }

    }
  }
}