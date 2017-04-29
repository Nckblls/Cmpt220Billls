/**
   * file: Project1010.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 26th, 2017
   * 
   * 
   * Tests the Queue class 
   * 
   */

public class Problem1010{
  public static void main(String[] args){
    Queue kool = new Queue();
    for (int i = 0; i <= 20; i++){
      kool.enqueue(i);
    }
    for (int i = 0; i <= 20; i++){
      System.out.println(kool.dequeue());
      
    }
  }
}