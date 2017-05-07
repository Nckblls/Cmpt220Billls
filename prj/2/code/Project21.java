 /**
   * file: Project2.java
   * author: Nicholas Bills
   * course: CMPT 220
   * assignment: Project2
   * due date: TBD
   * 
   * 
   * 
   * This file will be the GUI for the first version of the flashcard app. 
   * By thursday I want to be able to create new flashcards and sets, view flashcard sets, and to have a working version of the timer on the sets. 
   * 
   * Cycling through flashcards should be possible with keyboard commands.
   *
   **/


import java.awt.TextArea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;


import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;
import javax.swing.event.MenuListener;

import com.sun.glass.events.KeyEvent;

import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

public class Project21 extends Application {
  private TextField check = new TextField();
  private TextField size = new TextField();
  private TextField time = new TextField();
  private TextField fronttitle = new TextField();
  private TextField backtitle = new TextField();
  private JMenuBar menubar;
  private JMenu menu;
  private JMenuItem savee, open, quit;
  private Label flashvalue = new Label();
  private Label counter, frontlabel, backlabel;
  private Button btCreate, btView, btMnem, btOutl, newFlashcard, next, previous, save, recall, flip, edit, add, remove, home, timer;
  private Stage projectstage, addStage;
  private FlowPane signonpane, homepane, createpane, addpane;
  private BorderPane viewpane, mnemonicpane;
  private Scene homescene,createscene , viewscene, addscene, mnemonicscene;
  private boolean ifEdit = false;
  private Flashcardsets recalledset;
  private int fillingtheflashcards;
  private int position, currentpos;
  private String currentfront, currentback;
  private Flashcardsets hello;
  private Flashcards[] currentarray;
 
  public void start(Stage PrimaryStage) {
    currentpos = 0;
    //sets this for use in methods
    projectstage = PrimaryStage;
    addStage = new Stage();
    home = new Button("Home");
   
    
    // Create a scene and place a button in the scene
    homepane = new FlowPane(300,200);
    
    homepane.setPadding(new Insets(25, 25, 25, 25));
    homepane.setHgap(5);
    homepane.setVgap(5);
	 
    //check.setPromptText("Create new Flashcard Set");
    menubar = new JMenuBar();
    menu = new JMenu("Hello");
    menu.addMenuListener(null);
    menubar.add(menu);
    savee = new JMenuItem();
    menu.add(savee);
    open = new JMenuItem();
    menu.add(open);
    quit = new JMenuItem();
    menu.add(quit);
    
    
    btCreate = new Button("Create");
    btView = new Button("View");
    btMnem = new Button("Mnemonic");
    btOutl = new Button("Outline");
    
    btCreate.setOnAction(e ->{
      System.out.println("Button Pressed");
      projectstage.setScene(createscene);
    });
    
    
   
    btView.setOnAction(e -> {
      findFile();
    });
    
    
    
    btMnem.setOnAction(e -> {
    	
      System.out.println("Mnemonic button clicked");
      menmonic();
    });
    
    
    
    btOutl.setOnAction(e -> {
      System.out.println("Outline button clicked");
	  //Flashcardsets Chemistry = new Flashcardsets();
    
      //System.out.println(Chemistry);
     System.out.println(); 
    });
    
 
    homepane.getChildren().addAll( btCreate, btView, btMnem);
    homescene = new Scene(homepane, 230, 95);
    //createpane is created
    createpane = new FlowPane(50,50);
    Label one = new Label("Flashcardset Name:");
    Label two = new Label("Size of Flashcard Set:");
    Label three = new Label("Time interval on Flashcard set:");
    Button create = new Button("Next");
    Button skip = new Button("skip");
    skip.setOnAction(e -> {
      hello = new Flashcardsets();
      String ph = "Hey";   
      int checkk = 2;
      int chek = 2;
      hello.createFlashcardset(ph, checkk, chek);
      fillingtheflashcards = checkk;
      addStage.setScene(addscene);
      addStage.show();
      addStage.toFront();
      
    });
    home.setOnAction(e ->{
      projectstage.setScene(homescene);
      addStage.close();
    });
        
    
    
    
    
    create.setOnAction(e -> {
      if (check.getText().isEmpty() || size.getText().isEmpty() || time.getText().isEmpty()){
      System.out.println("Nice Try");
      }
      else if(isInt(size.getText()) && isInt(time.getText()))
      {String ph = (check.getText());
      hello = new Flashcardsets();
      int checkk = Integer.parseInt(size.getText());
      int chek = Integer.parseInt(time.getText());
      hello.createFlashcardset(ph, checkk, chek);
        
      fillingtheflashcards = checkk;
      addStage.show();
      addStage.toFront();
      }
      else{System.out.println("Nice Try!!");}
        //So we can have the flashcard set initialized. Maybe send this to a new GUI which acts to Better display the cards and the information that will be placed on them.
    });
    
    
    createpane.getChildren().addAll(one, check, two, size, three, time, create, skip, home);
    createscene = new Scene(createpane, 400, 300);

    //New Stage # addStage
    position = 0;
    addStage.setHeight(300);
    addStage.setWidth(400);
    counter = new Label(" "+ position);
    frontlabel = new Label("Set the front label:");
    backlabel = new Label("Set the back label:");
    newFlashcard = new Button("Next");
    newFlashcard.setOnAction(e ->{
      fillCards();	   
    });
    
    
    addpane = new FlowPane(50,50);
    addscene = new Scene(addpane, 500, 100);
    addpane.getChildren().addAll(counter, frontlabel, fronttitle, backlabel, backtitle, newFlashcard);
    
    addStage.setScene(addscene);
    
    
    System.out.println();
    
    
    
    PrimaryStage.setTitle("FlashcardProject"); // Set the stage title
    PrimaryStage.setScene(homescene); // Place the scene in the stage
    PrimaryStage.show(); // Display the stage
  }
 

 
  /**
   * Mnemonic
   *
   * Sets the mnemonic pane up, with the needed nodes. 
   * Creates a mnemonic object, Sends to the makemnemonic method, 
   * then takes the made mnemonic and adds it to the current page.  
   */
  private void menmonic() {

    mnemonicpane = new BorderPane();
    mnemonicscene = new Scene(mnemonicpane, 500, 400);
    Label mnemonic = new Label("Enter mnemonic");
    TextField stuff = new TextField("");
    Button nwe = new Button("Create Mnemonic!");
    Label madeMnemonic = new Label("");
    if (stuff.getText() != ""){
      nwe.setOnAction(e -> {
      Mnemonic judge = new Mnemonic(stuff.getText());
      madeMnemonic.setText(judge.getMnemonic());
    });}
    /*stuff.setOnKeyPressed(e -> {
      System.out.println(e.getText());
      if (e.getText() == " "){
        System.out.println("enter");
      }
	});*/
   
    mnemonicpane.setTop(stuff);
    mnemonicpane.setRight(nwe);
    mnemonicpane.setLeft(mnemonic);
    mnemonicpane.setCenter(madeMnemonic);
    mnemonicpane.setBottom(home);
    
    //mnemonicpane.getChildren().addAll(mnemonic, stuff, nwe, madeMnemonic, home);
    projectstage.setScene(mnemonicscene);
    
    
  }




//How do we fill the flashcards??
	//Send to method in the Flashcard sets that counts down and for each value it gets back it sends back to here
	//Cant send a method back to here but I 

	//nullpointerexception because the flashcard wasnt being created to go to the array
	//going to need to make a method to update the addStage counter
	//Is it possible to check if a loop is canceled and then call the isFull method if not
//Still need to figure out the making enter jump but we can do that later.
//Have A done button pop up once finished and use that to determine whether the flashcards are full.
 
 /* The necessary jumping code
  * frontlabel.setOnKeyPressed(e ->{
    	if (e.getCode()  == KeyCode.ENTER){
    		backtitle.requestFocus();
    	}
    });
  */
  /**
   * fillcards
   *
   * This function fills a flashcard object by bringing up a new scene with two 
   * textfields that can be entered into and then submitted to a flashcardset file until filled
   * 
   */
  public void fillCards(){
	//fillingtheflashcards is equal to the size of the set
	//position is the position in the set
    currentfront = fronttitle.getText();
    currentback = backtitle.getText();
    hello.fillCards(position, currentfront, currentback);
    position++;
    counter.setText(""+position);
    fronttitle.setText("");
    backtitle.setText("");
    fronttitle.requestFocus();
    addStage.show();
    addStage.toFront();    
    
    if (ifEdit == true){
      addStage.close();
      ifEdit = false;
      currentarray = hello.fullset();

    }else{
      if (position == fillingtheflashcards){
        currentarray = hello.fullset();
        addStage.close();
        currentpos = 0;
        currentarray = hello.fullset();
        showFront(currentpos);
      }
    }
  }




 
  /**
   * Saveset
   *
   * This method saves the flashcardsset via the name of the set 
   */
    //Not the best way to save for transfer
	//Saves the object to a temporary file with the name of setname, the object has to be of type flashcards
	//but we don't want to be saving individual flashcards we will want to group them into a set and then save this object
	//so this should be in the project2 folder using 
  public static void Saveset(Flashcardsets s, String setname)throws ClassNotFoundException, IOException{
// Create an output stream for file array.dat
    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(setname + ".dat", true));
// Write arrays to the object output stream
    output.writeObject(s);
    output.close();
  }
  /**
   * Recallset
   *
   * This method recalls a file based on the name of it. 
   */
	//Reads the object from the temporary file with the name of setname, returns the object so it has a new permanent variable within the class.  
  public void Recallset(String setname) throws FileNotFoundException, IOException, ClassNotFoundException{
    ObjectInputStream input = new ObjectInputStream(new FileInputStream(setname + ".dat"));
    hello = (Flashcardsets) input.readObject();
    currentarray = hello.fullset();	
    input.close();
  }

 

  /**
   * isInt
   *
   * This method ensures that the input is an interger 
   */
  public boolean isInt(String input){

    for (int i = 0; i < input.length(); i++){
      if(i == 0 && input.charAt(i) == '-') {
        i++;
        if(input.length() == 1) return false;
      }
      if(Character.isLetter(input.charAt(i))) return false;
    }
    return true;
  }
	
	
	

	
  /**
   * updateAddPage
   *
   * This method changes the addpage to fit the new data presented by the labels 
   */
//Meant to update the add page, do I want to bring down the labels?? or remake them?
  public void updateAddPage(){
    if (position == fillingtheflashcards){
      Label filled = new Label("The flashcard set has been filled");
      addpane.getChildren().addAll(filled);
    }
    else{
      addpane.getChildren().addAll(counter, frontlabel, fronttitle, backlabel, backtitle, newFlashcard);
      addStage.setScene(addscene);
      addStage.show();
      addStage.toFront();
    }
  }

/**
 * Filter
 *
 * This finds all the files in a folder that posess ".dat" 
 */
	//Found this to search through and find all .dat files in the saving folder. 
  public class Filter {
    public File[] finder(String dirName){
      File dir = new File(dirName);
      return dir.listFiles(new FilenameFilter() { 
        public boolean accept(File dir, String filename)
        { return filename.endsWith(".dat"); }
      } );
    }
  }
	
/**
 * showFront
 *
 * This method is meant to change the viewpane in order to view the flashcards. 
 */
	
  public void showFront(int pos){
  //view pane
    viewpane = new BorderPane();    
    Font font1 = new Font("SansSerif", 25);
    Font font2 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30);
    //Flashcards f = hello.fullset(5); 1
    //Figure out how to resize this text
	
	
    String frontcurr = currentarray[pos].printFront();
    String backcurr = currentarray[pos].printBack();

    flashvalue.setText(frontcurr);
    flashvalue.setFont(font2);
    next = new Button("Next");
    next.setOnAction(e -> {
      if (currentpos != currentarray.length - 1){
        
        currentpos++;
        showFront(currentpos);
      }
    });
   
    flip = new Button("flip");
    flip.setOnAction(e -> {
      if (flashvalue.getText()==frontcurr){
        flashvalue.setText(backcurr);
      }
      else if (flashvalue.getText() == backcurr){ 
        flashvalue.setText(frontcurr);
      }
    });
    
    edit = new Button("Edit");
    edit.setOnAction(e ->{
    ifEdit = true;
    position = currentpos;
    addStage.show();
    });   
    
    timer = new Button("Timer");
    timer.setOnAction(e ->{
      timer();
    });
    
    save = new Button("Save");
    save.setOnAction(e -> {
      String savename = hello.getName();
      try {
		Saveset(hello, savename);
      } catch (Exception e1) {
    // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    });
    
    previous = new Button("Previous");
    previous.setOnAction(e -> {
      if (currentpos != 0){
        System.out.println("Previous");
        currentpos--;
   	    showFront(currentpos);
      }
    });
    viewPage();
    timer = new Button("Start Timer");
    timer.setOnAction(e -> {
      timer();
    });
  }

  /**
   * viewSubset
   *
   * Sends a subset to the view flashcard app 
   */
  public void viewSubset(Flashcards[] flashcardsubset) {
    currentarray = flashcardsubset;
    currentpos = 0;
    showFront(currentpos);
  }



/**
 * findFile
 *
 * This method is intended to add a textbox where a filename can be input to retrieve said file
 */
  public void findFile(){
    System.out.println("View button clicked");

    TextField filename = new TextField("Hello");
    Button b = new Button();

    homepane.getChildren().clear();
    homepane.getChildren().addAll(btCreate, btView, btMnem, filename, b);
    b.setOnAction(e -> {
      if (filename.getText() != "Hello"){
        try {
          Recallset(filename.getText());
        } catch (Exception e1) {
          e1.printStackTrace();
        }			
        showFront(currentpos);
      }	
    });
	 
  }
/**
 * viewPage
 *
 * This establishes the final view page with an extra page for extra  
 */
  public void viewPage(){
    Label currentslide = new Label("The current slide is: " + currentpos);
    viewpane.setTop(currentslide);
    viewpane.setCenter(flashvalue);
    viewpane.setLeft(previous);
    viewpane.setRight(next);
    viewpane.setBottom(flip);
    VBox sidepane = new VBox();
    sidepane.getChildren().addAll(save, edit, home, timer);
    Scene sidescene = new Scene(sidepane,50, 50);
    addStage.setScene(sidescene);
    addStage.setTitle("Extra Resources");
    addStage.show();


    //viewpane.getChildren().addAll(currentslide, flashvalue, previous, flip, next, save, edit, home, timer);
    viewscene = new Scene(viewpane, 500, 400);
    projectstage.setScene(viewscene);
  }
  
  
/**
 * timer
 *
 * This is meant to activate the timer portion, which opens a subset after a period of time. 
 */
  public void timer(){
    int timeframe = hello.getTime();
    System.out.println("here");
    Timer g = new Timer(timeframe * 60000, e ->{
      System.out.println("WOrking");
      Flashcards[] subset = hello.subset();
      viewSubset(subset);
    });
    g.start();
    addStage.close();
    projectstage.close();
    
  }

	
/**
* The main method is only needed for the IDE with limited
* JavaFX support. Not needed for running from the command line.
*/
  public static void main(String[] args) {
    Application.launch(args);
  }
}