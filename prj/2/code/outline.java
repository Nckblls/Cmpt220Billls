 /**
   * file: Outline.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Project2
   * due date: TBD
   *
   * 
   *  This file contaits the outline object
   *  This will fill an array with string values corresponding to the parents identity  
   *
   *
   **/
import java.lang.reflect.Array;

public class outline {
  private int end, arraypos1, arraypos2;
  private String[][] outline;
  private String parent, value;
    
  public void createOutline(String textvalue){
    outline = new String[100][8];
    if (textvalue.charAt(0) ==  '('){
      for (int i = 0; i< textvalue.length(); i ++){
        if (textvalue.charAt(i)==')'){
          end = i;
          value = textvalue.substring(i+1, textvalue.length()-1);
          parent = textvalue.substring(1, i-1);
        }
      }
    }
    else{
      value= textvalue;
    }
    if (parent == null){
      arraypos1 = 0;
      if (outline[0][0] == null){
        arraypos2 = 0; 
      }
      else{
        for (int i = 1; i < outline[0].length; i++){
          if (outline[0][i - 1] != null && outline[arraypos1][i] == null){
            arraypos2 = i;
          }
        }
        outline[arraypos1][arraypos2] = textvalue;
      }
    }
    else{
      for (int i = 0; i < outline.length; i++){
        for (int g = 0; g < outline.length; g++){
          if (outline[i][g] == "parent"){
            if (i == 0){
              if (outline[g][0] == null){
                arraypos1 = g; 
                arraypos2 = 0;
              }
              else {
                for (int d = 0; d < outline.length; d++){
                  
                }
              }
            }
          }
        }
      }
    }
  }
    
    
    
    //I want this to have a two dimensional array that holds the values given by the creator. The creator will specify the connections between things. 
    //Based on these specifications the values will be placed into the two dimensional array in a raged assortment that will be able to be deciphered and displayed in the GUI. 
  }



//For this I want to start with one object, and then you can add others above or below. 