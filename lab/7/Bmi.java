/**
   * file: ProjectBMI.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18th, 2017
   * 
   * 
   * This class calculates the BMI of an individual
   * 
   */
class BMI{
  private String name;
  private int age;
  private double weight; //in pounds
  private double height; //in inches
  private static final double KILOGRAMS_PER_POUND = 0.45359237;
  private static final double METERS_PER_INCH = 0.0254;

  /**
   * BMI
   *
   * This function creates a BMI object with specific variables.
   * Parameter:
   * String name is the persons name
   * int age is the individuals age 
   * weight is the weight of the person
   * height is the persons height
   */
  public BMI(String name, int age, double weight, double height) {
   this.name = name;
   this.age = age;
   this.weight = weight;
   this.height = height;
   }
  /**
   * BMI
   *
   * This function creates a BMI object with specific variables.
   * Parameter:
   * String name is the persons name
   * weight is the weight of the person
   * height is the persons height
   */
  public BMI(String name, double weight, double height) {
    this(name, 20, weight, height);
  }
  /**
   * getBMI
   *
   * Calucaltes the BMI
   * return value: The calculated BMI as a double
   */
  public double getBMI() {
    double bmi = (weight * KILOGRAMS_PER_POUND) /((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  /**
   * getStatus
   *
   * Determines the nature of the BMI
   * return value: The status of the individual based on the BMI
   */
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  /**
   * getName
   *
   * Returns the name
   * return value: Name as a string
   */
  public String getName() {
    return name;
  }
  /**
   * getAge
   *
   * Returns the age. 
   * return value: The age as an int
   */
  public int getAge() {
    return age;
  }
  /**
   * getweight
   *
   * Returns the weight 
   * return value: The weight as a double
   */
  public double getWeight() {
    return weight;
  }
  /**
   * getHeight
   *
   * Returns the heigh
   * return value: The height as a double
   */
  public double getHeight() {
    return height;
  }
  
    /**
   * BMI
   *
   * This function creates a BMI object with specific variables.
   * Parameter:
   * String name is the persons name
   * int age is the individuals age 
   * weight is the weight of the person
   * feet is the persons height in feet
   * inches is the height past the feet
   */
  public BMI(String name, int age, double weight, double feet, double inches){
    this.height = (feet*12) + inches;
    this.weight = weight;
    this.name = name;
    this.age = age; 
  }
}