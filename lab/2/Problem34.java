 /**
   * file: Problem34.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 8th, 2017
   * version: 1.2
   * 
   * 
   * Creates a random interger and tells the corresponding month. 
   */
public class Problem34{
  public static void main(String[] args){
    int randomnumber = (int)(Math.random()*12) + 1;
    if (randomnumber == 1){
      System.out.println("January");
    }
    else if (randomnumber == 2){
      System.out.println("February");
    }
    else if (randomnumber == 3){
      System.out.println("March");
    }
    else if (randomnumber == 4){
      System.out.println("April");
    }
    else if (randomnumber == 5){
      System.out.println("May");
    }
    else if (randomnumber == 6){
      System.out.println("June");
    }
    else if (randomnumber == 7){
      System.out.println("July");
    }
    else if (randomnumber == 8){
      System.out.println("August");
    }
    else if (randomnumber == 9){
      System.out.println("September");
    }
    else if (randomnumber == 10){
      System.out.println("October");
    }
    else if (randomnumber == 11){
      System.out.println("November");
    }
    else if (randomnumber == 12){
      System.out.println("December");
    }
  }
}