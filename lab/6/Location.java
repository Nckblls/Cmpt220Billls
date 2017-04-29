/**
   * file: Project91.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18th, 2017
   * 
   * 
   * 
   * This is the location object that is intended to find the highest value in a double array.
   */
  
class Location{
  public int row = 0;
  public int column = 0;
  public double maxValue;
  
   /**
   * Location
   *
   * This function creates a default Location object 
   */
  Location(){
  }
  
  /**
   * locateLargest
   *
   * This function determines the largest value in an array and the location of it.
   *  
   * 
   * 
   * Return value: a Location object with 
   * variables that hold the largest value and the location of it
  */
  public Location locateLargest(double[][] a){
    Location abe = new Location();
    maxValue=a[row][column];
    for (int i = 0; i < a.length; i++){
      for (int g = 0; g < a[i].length; g++){
        if (a[i][g] > maxValue){
          maxValue = a[i][g];
          row = i;
          column = g; 
        }
      }
    }
    return abe;
  }
}