/**
   * file: Queue.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 24th, 2017
   * 
   * 
   * This class creates a queue array that operates on a first in, first out status. 
   * 
   */
public class Queue{
  private int[] elements;
  private int size;
  private int pos;
  
  /**
   * Queue
   *
   * This function creates a Queue object with normal parameters
   * 
   */
  public Queue(){
    size = 8; 
    elements = new int[size];
    pos = 0;
  }
  
  
  /**
   * enqueue
   *
   * This function adds an element to the queue
   * Parameter:
   * int v is the variable added to the queue
   */
   
   
  public void enqueue(int v){
    if (pos >= elements.length){
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[pos] = v;
    pos++;
  }
 

  /**
   * dequeue
   *
   * This function removes the first element in the array
   * Return:
   * int first is the variable removed from the front of the queue
   */
  public int dequeue(){
    int first = elements[0];
    for (int i = 1; i < elements.length; i++){
      int after = elements[i];
      int before = elements[i-1];
      elements[i-1] = after;
    }
    pos--;
    return first;
  }
  
  
  /**
   * empty
   *
   * This function checks if the queue is empty
   * Return:
   * boolean true if the list is empty
   */
  public boolean empty(){
    return pos == 0;
  }

 /**
   * getSize
   *
   * This function checks the size of the array
   * Return:
   * int pos is the size of the array
   */
  public int getSize(){
    return pos;
  }
}