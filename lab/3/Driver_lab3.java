/**
   * file: Problem63.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 23rd, 2017
   * 
   * Determines the distance between two points as per the kattis assignment guidelines. 
   * 
   * 
   */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Driver_lab3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Takes in values
    while (true){
    double x1 = input.nextDouble();
    if (x1==0){
      break;
    }
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double p = input.nextDouble();
    //Does tha mathematics	
    double xdiff = Math.abs(x1- x2);
    double ydiff = Math.abs(y1-y2);
    double xdiffexp = Math.pow(xdiff, p);
    double ydiffexp = Math.pow(ydiff, p);
    double distance = Math.pow((xdiffexp+ydiffexp), (1/p));
    DecimalFormat df = new DecimalFormat("#.0000000000");
    System.out.println(df.format(distance));
    }
  }
}