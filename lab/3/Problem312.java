// Problem312.java
// Nicholas Bills
// February 23, 2017
import java.util.Scanner;
public class Problem312{
  public static void main(String[] args){
    int number = 0;
	int numbersquared = 0;
	while (numbersquared < 12000){
      number++;
      numbersquared = number*number;
	}
    System.out.println("The smallest value of N is: " + number);
	
    
  }
}