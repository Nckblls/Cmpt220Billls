// Problem313.java
// Nicholas Bills
// February 23, 2017
import java.util.Scanner;
public class Problem313{
  public static void main(String[] args){
    int number = 0;
	int numbercubed = 0;
	while (numbercubed < 12000){
      number++;
      numbercubed = number*number*number;
	}
    System.out.println("The largest value of N is: " + number);
	
    
  }
}