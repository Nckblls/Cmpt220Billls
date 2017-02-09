/**
   * file: Problem415.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * 
   * 
   * Takes a letter and gives the corresponding number
   * on a phone pad.
   */
import java.util.Scanner;
public class Problem415{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a Capital letter");
    String letterinput = input.next();
    char letter = letterinput.charAt(0);
    int letternumber = (int)letter;

    if ((letternumber / 10)  == 6){
      switch (letternumber % 10){
          case 5: System.out.println("2");break;
          case 6: System.out.println("2");break;
          case 7: System.out.println("2");break;
          case 8: System.out.println("3");break;
          case 9: System.out.println("3");break;
      }
    }
    if ((letternumber / 10)  == 7){
      switch (letternumber % 10){
          case 0: System.out.println("3");break;
          case 1: System.out.println("4");break;
          case 2: System.out.println("4");break;
          case 3: System.out.println("4");break;
          case 4: System.out.println("5");break;
          case 5: System.out.println("5");break;
          case 6: System.out.println("5");break;
          case 7: System.out.println("6");break;
          case 8: System.out.println("6");break;
          case 9: System.out.println("6");break;
      }
    }
    if ((letternumber / 10)  == 8){
      switch (letternumber % 10){
          case 0: System.out.println("7");break;
          case 1: System.out.println("7");break;
          case 2: System.out.println("7");break;
          case 3: System.out.println("7");break;
          case 4: System.out.println("8");break;
          case 5: System.out.println("8");break;
          case 6: System.out.println("8");break;
          case 7: System.out.println("9");break;
          case 8: System.out.println("9");break;
          case 9: System.out.println("9");break;
      }
    }
    if ((letternumber / 10)  == 9){
      System.out.println("9");
    }
  }
}