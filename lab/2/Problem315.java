/**
   * file: Problem315.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * version: 1.3
   * 
   * 
   * Takes a letter and gives the corresponding number
   * on a phone pad.
   */
import java.util.Scanner;

public class Problem315 {
  public static void main(String[] args) {
    // Generate a lottery number
    int lottery = (int)(Math.random() * (1000-100))+100;

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit1 = lottery / 100;
    int lotteryDigit3 = lottery % 10;
    int lotteryDigit2 = (lottery % 100)/10;

    // Get digits from guess
    int guessDigit1 = guess / 100;
    int guessDigit3 = guess % 10;
    int guessDigit2 = (guess % 100)/10;
	

    System.out.println("The lottery number is " + lottery);
    int all = 0;
    
    if ((guessDigit1 == lotteryDigit1) && (guessDigit2 == lotteryDigit2) && (guessDigit3 == lotteryDigit3)){
      all = all++;
    }
    int some = 0;
    if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3){
      some++;
    }
    if (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3){
      some++;
    }
    if (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3){
      some++;
    } 
    if (some >=3){
      if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)&&(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)&&(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)){
        some = 3;
      }
      else {
        some = 2;
      }
    }
 
 
    // Check the guess
    switch (all){
      case 1: System.out.println("Perfect Match: you win $10,000"); break;
      case 0: 
        switch(some){
          case 3:System.out.println("Match all digits: you win $3,000"); break;
          case 1: System.out.println("Match one or more digit(s): you win $1,000"); break;
          case 2: System.out.println("Match one or more digit(s): you win $1,000"); break;
        }
	

    }

  }
}