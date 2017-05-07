
/**
  * file: Flashcards.java
  * author: Nicholas Bills
  * course: CMPT 220
  * assignment: Project2
  * due date: TBD
  * 
  * 
  * 
  * This file will hold an array of flashcards, maintaining them by their subject. 
  * It should contain these in an array, it should also have flashcard set information such as the subject, if the person
  * wants a timer to go off...etc.
  * 
  * 
  *
  *
  **/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flashcardsets implements Serializable {
  private String name = "";
  private String subject = "";
  private Flashcards[] setofcards;
  private int time;
  private static final long serialVersionUID = 1113799434508676095L;
  public Flashcardsets(){
  }
  
  /**
   * createFlashcard
   *
   * This method creates the flashcard set and the array 
   */
  public void createFlashcardset(String setname, int numberofflashcards, int newtime) {
    name = setname;
    //if time is negative then no timer used
    time = newtime;
    setofcards = new Flashcards[numberofflashcards];
  }

  /**
   * fillCards
   *
   * This method fills the flashcards at a position
   */
  public void fillCards(int position, String front, String back) {
    System.out.println(front);
    System.out.println(back);
    Flashcards h = new Flashcards(front ,back);
    setofcards[position] = h;
  }

  /**
   * getName
   *
   * This method returns the name of the set 
   */
  public String getName(){
    return name;
  }
  
  /**
   * getTime
   *
   * This method returns the set time. 
   */
  public int getTime(){
    return time;
  }
	
  /**
   * getSize
   *
   * returns the size of the array 
   */
  public int getSize(){
    return setofcards.length;
  }
	
  /**
   * fillcards
   *
   * This mehtod fills the flashcard array with values. 
   */
  public void fillCards(String front, String back){
    int position = 0; 
    setofcards[position].set(front, back);
  }
  
  
  /**
   * addcard
   *
   * This method adds a flashcard to the flashcard array 
   */
  public void addCard(String front, String back) {
    setofcards = Arrays.copyOf(setofcards, setofcards.length + 1);
    Flashcards t = new Flashcards();
    t.set(front, back);
    int x = setofcards.length - 1;
    setofcards[x] = t;
  }

  /**
   * deletecard
   *
   * This method is meant to delete the current flashcard from the set 
   */
  public void deletecard(int position, String front, String back) {
    Flashcards[] newset = new Flashcards[setofcards.length - 1];
    //Makes a temp array for 1 less size,
    //Then goes through and takes the one out of that place
    for (int i = 0; i < setofcards.length; i++) {
    //If it matches the delete variables it skips the copying
      if (i == (position - 1) && setofcards[i].printFront() == front && setofcards[i].printBack() == back) {
      }
      else{
        for (int g = 0; g < setofcards.length; g++) {
        newset[g] = setofcards[i];
        }
      }
    }
    setofcards = newset;
  }
  
  
  /**
   * checkfilled
   *
   * This method checks if the array has values throughout, removes non created cards 
   */
	// This should be checked after every add and should remove unused cards
  public void checkfilled() {
    int numofempties = 0;
    for (int i = 0; i < setofcards.length; i++) {
      if (setofcards[i] == null) {
        System.out.println("Set not filled, cards deleted.");
        numofempties++;

      }
    }
    if (numofempties > 0) {
      Flashcards[] newset = new Flashcards[setofcards.length - numofempties];
      for (int i = 0; i < setofcards.length; i++) {
        if (setofcards[i] != null) {
          for (int g = 0; g < setofcards.length; g++) {
            newset[g] = setofcards[i];
          }
        }
      }
      setofcards = newset;
    }

  }
  /**
   * Subset
   *
   * Creates a simple subset of the flashcard array 
   */
  public Flashcards[] subset() {
		// Is meant to create a subset of Flashcards, if you want to add
		// difficulty to the cards then there needs to be a way it includes that
		// calls the subset and sends it to be seen.
    int random;
    Flashcards[] flashsubset = new Flashcards[setofcards.length/3];
    for (int i = 0; i < flashsubset.length; i++){
      random = (int) (Math.random() * setofcards.length);
      flashsubset[i] = setofcards[random];
    }
    return flashsubset;

  }
	
  public Flashcards[] fullset(){
    return setofcards;
  }
}