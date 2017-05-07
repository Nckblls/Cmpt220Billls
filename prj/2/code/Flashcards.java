 /**
  * file: Flashcards.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Project2
   * due date: TBD
   * 
   * 
   * 
   * This file will be an object for flashcards, the flashcards should posess at least two sets of data a front and a back. Eventually they should be able to hold pictures.
   * This file will be held under another file which will hold flashcard sets, so that all the flashcards of the same set can be kept together. 
   *
   *
   **/
import java.io.*;

public class Flashcards implements Serializable{
	
  private String frontofcard = "";
  private String backofcard = "";
  
  /**
   * Flashcards
   *
   * This creates an empty flashcard 
   */
  public Flashcards(){
  }
  
  /**
   * Flashcards
   *
   * This creates a flashcard with values in it 
   */
  public Flashcards(String front, String back){
    frontofcard = front;
    backofcard = back;
  }
  
  /**
   * set
   *
   * This sets the values of flashcard 
   */
  public void set(String front, String back){
    frontofcard = front;
    backofcard = back;
  }

  /**
   * setFront
   *
   * This sets the front 
   */
  public void setFront(String front){
    frontofcard = front;
  }

  /**
   * setBack
   *
   * This sets the back 
   */
  public void setBack(String back){
    backofcard = back;
  }
  
  /**
   * printfront
   *
   * This returns the front 
   */
  public String printFront(){
    return frontofcard;
  }
  
  /**
   * printBack
   *
   * This returns the back 
   */
  public String printBack(){
    return backofcard;
  }
}
