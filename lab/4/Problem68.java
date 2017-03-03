/** 
  * file: Problem68.java
  * author: Nicholas Bills
  * course: CMPT 220
  * assignment: Lab 4
  * due date: March 2nd
  *
  * Uses methods to convert between celsius and farenheit
  * Creates a table of converted values
  */
import java.text.DecimalFormat;
public class Problem68{
  public static void main(String[] args){
    DecimalFormat numberFormat = new DecimalFormat("#.0");
    double celsius = 41.0;
    double farenheit = 130.0;
    System.out.println("Celsius      Farenheit   |   Farenheit       Celsius");
    System.out.println("_________________________________________________");
    //Creates the table of converted values
    for (int i = 0; i < 10; i++){
      double celconverted = celsiusToFarenheit(celsius);
      celsius--;
      double farconverted = farenheitToCelsius(farenheit);
      farenheit = farenheit - 10;
      System.out.print(celsius + "     ");
      System.out.println(numberFormat.format(farconverted) + "  |   " + farenheit + "   " + celsius);
      
    }
    
    
  }
  
  /**
   * celsiusToFarenheit
   *
   * This function changes a celsius temperature value to a farenheit one
   * 
   * Parameters:
   *   celsius: That will be converted to farenheit 
   * 
   * Return value: The corresponding farenheit value
   */
  public static double celsiusToFarenheit(double celsius){
    double farenheit = (9.0 / 5) * celsius + 32;
    return farenheit;
  }
  
  /**
   * farenheitToCelsius
   *
   * This function changes a farenheit temperature value to a celsius one
   * 
   * Parameters:
   *   farenheit: That will be converted to celsius 
   * 
   * Return value: The corresponding celsius value
   */
  public static double farenheitToCelsius(double farenheit){
    double celsius = (5.0 / 9) * (farenheit - 32);
    return celsius;
  }

}