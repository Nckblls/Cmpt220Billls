/** 
  * file: Problem620.java
  * author: Nicholas Bills
  * course: CMPT 220
  * assignment: Lab 4
  * due date: March 2nd
  *
  * Has a method that will count the letters in a string.
  * Uses method to the number of letters in a entered string.
  */
import java.util.Scanner;
public class Problem620{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string:");
    String countingletters = input.nextLine();
    int numletters = countLetters(countingletters);
    System.out.println("You have " + numletters + " letters in your string.");
  }
  
  
  
  /**
   * countLetters
   *
   * This function counts the number of letters in the given string. 
   * 
   * Parameters:
   *   s: this is the string that will be read.
   * 
   * Return value: The number of letters in the string.
   */
  public static int countLetters(String s){
    int numofletters = 0;
    for (int i = 0; i < s.length();i++){
      char position = s.charAt(i);
      if ((position > 65) & (position < 122)){
        numofletters++;
      }
    }
    return numofletters;
    
  }
}