 /**
   * file: Mnemonic.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Project2
   * due date: TBD
   * 
   * 
   * 
   * This creates the mnemonic value by adding random words of the first letter into a string.
   *
   **/
public class Mnemonic {
  private String knowledge;
  private String mnemonic;
  private String[][] library = {{"anesthesiologist.", "antihypertensive.", "aminotransferase.", "arteriosclerosis.", "anthropomorphism.", "accommodationist.", "archconservative.", "atrioventricular."
  ,"Aardvarks", "Antelopes", "A", "Are", "Apple", "Arabian"},	{"Bees", "Bite", "Bruises", "Brown", "Blows"}, {"Cement", "Cinematics", "Chorus", "Chimes", "Cheese"},
  {"dihydrotestosterone.","diethylstilboestrol.", "dimethylnitrosamine.",	"deoxyribonucleotide.",	"deoxycorticosterone.",	"deoxyribonucleoside.", "departmentalization." ,"deindustrialization."} 
  ,{"Even", "Ears" , "Eyes" , "Eaten", "Eve" }, {"Frigte" , "Falcon", "Foxrun", "Flaming", "Fight", "Fright"},{"Georgia", "Grand", " Gourd" , "Grip", " Grabs"}, {"Heaven", "Heights", " Hats", "Heaps"}, 
  {"Iodine", "Icecream", " Inbound", "Imagines"}, {"Jubilee", "Jaunt", "Jimmy", "Joins"}, {"Kleptomaniac", "King", "Kind", "Knit"}, {"Lefty", "Limbo", "Lion", "Lineman", "Loop"}, 
  {"Moon", "Miner", "Music", "Melt"}, {"Nicholas", "Nigh", "Neat", "Never"}, {"Optimus", "OOcytes", "Ooops", "Oil"}, {"Pool", "Pile", "Peel", "Push"}, {"Quaint", "Quiet", "Quilt", "Quack"},
  {"Rest", "Ripe", "Rope", "Reap" }, {"Submarine", "Slime", "Sloop", "Soot"}, {"Tube", "Tiny", "Tamborine", "Title"}, {"Upside", "Undo", "Usurp"}, {"Vertigo", "Vantage", "Villain", "Vroom"},
  {"Wrestle", "Wild", "Wings", "Woods"}, {"X-ray", "X-ample"}, {"Yellow", "Yeast", "Year"}, {"Zebra", "Zygote"}};


	
  /**
   * Menmonic
   *
   * This creates the mnemonic object, and invokes the createMenmonic method 
   */
  public Mnemonic(String words){
    knowledge = words;
    mnemonic = "";
    createMnemonic();
  }
  
//Separates each word and then picks a new word based on first letter
  /**
   * createMenmonic
   *
   * This creates the mnemonic with random values 
   */
  public void createMnemonic(){
   	/*for (int i = 0; i < knowledge.length(); i++){
    		int first = knowledge.indexOf(' ');
    	}*/
    //num counts the number of spaces
    int num = 0;
    //pos tells us where the spaces are
    int pos = knowledge.indexOf(' ');
    //this tells us if there is a space
    if (pos != -1){
      num++;
    }
    
    
    //is meant to find all the spaces after the first one
    while (pos != -1){
      pos = knowledge.indexOf(' ', pos+1);
      if (pos != -1){
        num++;
      }
    }
    
    //Create array to take substrings in, size is num+1 because for each space there is at most one more word
    String[] words = new String[num+1];
   //position is made to value of first space
    pos = knowledge.indexOf(' ');
    int lastposused = 0;
    //if there is at least one space then a substring is added to the first position
    if (pos != -1){
      words[0] = knowledge.substring(0, pos);
      lastposused = pos;
        num++;
    }
    //if there is not one space the entire string is made into the first postion
    else{
      words[0] = knowledge;
    }
    //Should probably make a for loop for each value of num instead of another while loop
    for(int i = 1; i < num; i++){
      pos = knowledge.indexOf(' ', pos+1);
      if (pos != -1){
        words[i] = knowledge.substring(lastposused+1, pos);
        lastposused = pos;
      }
      if (pos == -1){
        words[i] = knowledge.substring(lastposused+1); 
      }
    }
   
    
    
    for (int i = 0; i < words.length; i++){
      System.out.println(words[i]);
    }
    
    
    
    char[] letters = new char[words.length];
    //This is what takes the first letter
    
    for (int i = 0; i < words.length; i++){
      words[i]= words[i].toLowerCase();
      letters[i] = words[i].charAt(0);
      System.out.println(letters[i]);
    }
    
    for (int i = 0; i < letters.length; i++){
      int lettervalue = letters[i];
      lettervalue = lettervalue-97;
      int random = (int) (Math.random() * 4);
      String word = library[lettervalue][random];  
      mnemonic += word;
      mnemonic += " ";
    }
    
    
    //Now that we have all the first letters, we need to go through and create a mnemonic
    //Create arrays for each letter with a bunch of words and then stick them together. Maybe do this in another class or something. Can do it in a  double array and have each letter equal to the lower case and then correspond them to the position in the array. 
    
    
   }
//Now that we are returning a string array with each string in them we need to create something to take the first letter of each 
    //String and then pick randomly from a library of words to create the mnemonic. 
    // We're home free boss. 
  /**
   * getMnemonic
   *
   * This returns the mnemonic made 
   */
  public String getMnemonic(){
    return mnemonic;
  }
}
